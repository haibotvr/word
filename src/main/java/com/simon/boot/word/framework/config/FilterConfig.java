package com.simon.boot.word.framework.config;

import com.google.common.collect.Lists;
import com.simon.boot.word.framework.filter.LoggerMDCFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.List;

/**
 * @author simon.wei
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean loggerMDCFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(loggerMDCFilter());
        List<String> urlList = Lists.newArrayList();
        urlList.add("/*");
        registration.setUrlPatterns(urlList);
        registration.setName("loggerMDCFilter");
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public Filter loggerMDCFilter() {
        return new LoggerMDCFilter();
    }

}
