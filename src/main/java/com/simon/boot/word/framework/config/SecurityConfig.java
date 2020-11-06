package com.simon.boot.word.framework.config;

import com.simon.boot.word.framework.exception.RestAuthenticationEntryPoint;
import com.simon.boot.word.framework.exception.RestfulAccessDeniedHandler;
import com.simon.boot.word.framework.filter.JwtAuthenticationTokenFilter;
import com.simon.boot.word.framework.kits.LeafConstant;
import com.simon.boot.word.framework.kits.UserUtil;
import com.simon.boot.word.pojo.manual.OaUserDetails;
import com.simon.boot.word.pojo.manual.UdpUserDetails;
import com.simon.boot.word.pojo.oa.OaUser;
import com.simon.boot.word.pojo.udp.UdpUser;
import com.simon.boot.word.pojo.word.WordPermission;
import com.simon.boot.word.pojo.word.WordUser;
import com.simon.boot.word.pojo.manual.WordUserDetails;
import com.simon.boot.word.service.oa.ExtraService;
import com.simon.boot.word.service.udp.UdpUserService;
import com.simon.boot.word.service.word.WordUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.List;
import java.util.Objects;

/**
 * @author simon.wei
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private RestfulAccessDeniedHandler restfulAccessDeniedHandler;

    @Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

    @Autowired
    private WordUserService wordUserService;

    @Autowired
    private ExtraService oaUserService;

    @Autowired
    private UdpUserService udpUserService;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf()// 由于使用的是JWT，我们这里不需要csrf
                .disable()
                .sessionManagement()// 基于token，所以不需要session
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                // 允许对于网站静态资源的无授权访问
                .antMatchers(HttpMethod.GET,
                        "/",
                        "/*.html",
                        "/favicon.ico",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js",
                        "/**/*.png",
                        "/**/*.gif",
                        "/swagger-resources/**",
                        "/v2/api-docs/**"
                )
                .permitAll()
                // 对登录注册要允许匿名访问
                .antMatchers("/user/login")
                .permitAll()
                .antMatchers(HttpMethod.POST,"/udp/user/add")
                .permitAll()
                .antMatchers(HttpMethod.GET,"/heap")
                .permitAll()
                .antMatchers(HttpMethod.GET,"/lock")
                .permitAll()
                .antMatchers(HttpMethod.POST,"/udp/user/login")
                .permitAll()
                .antMatchers(HttpMethod.OPTIONS)
                .permitAll()
//                .antMatchers("/**")//测试时全部运行访问
//                .permitAll()
                .anyRequest()
                .authenticated();
        // 禁用缓存
        httpSecurity.headers().cacheControl();
        // 添加JWT filter
        httpSecurity.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
        // 添加自定义未授权和未登录结果返回
        httpSecurity.exceptionHandling()
                .accessDeniedHandler(restfulAccessDeniedHandler)
                .authenticationEntryPoint(restAuthenticationEntryPoint);

    }

    @Bean
    public JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter(){
        return new JwtAuthenticationTokenFilter();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService())
                .passwordEncoder(passwordEncoder());
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService(){
        return username -> {
            //参数不为空
            if(Objects.isNull(username)) {
                return null;
            }
            String[] names = username.split(LeafConstant.PROJECT_CONCAT_MARK);
            if(username.endsWith(LeafConstant.PROJECT_OA)) {
                OaUser user = oaUserService.findUserById(Long.valueOf(names[0]));
                if(Objects.nonNull(user)) {
                    UserUtil.set(user);
                    return new OaUserDetails(user);
                }
            }
            if(username.endsWith(LeafConstant.PROJECT_UDP)) {
                UdpUser user = udpUserService.findById(Long.valueOf(names[0]));
                if(Objects.nonNull(user)) {
                    UserUtil.set(user);
                    return new UdpUserDetails(user);
                }
            }
            if(username.endsWith(LeafConstant.PROJECT_WORD)) {
                WordUser user = wordUserService.findById(Long.valueOf(names[0]));
                if(Objects.nonNull(user)) {
                    UserUtil.set(user);
                    List<WordPermission> permissions = (List<WordPermission>) wordUserService.getPermissions(user.getId()).getData();
                    return new WordUserDetails(user, permissions);
                }
            }
            return null;
        };
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
