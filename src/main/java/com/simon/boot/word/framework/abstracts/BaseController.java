package com.simon.boot.word.framework.abstracts;

import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.kits.LeafConstant;
import com.simon.boot.word.framework.kits.UserUtil;
import com.simon.boot.word.pojo.OaUser;
import com.simon.boot.word.pojo.WordUser;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author simon.wei
 */
@Slf4j
public class BaseController {

    protected HttpServletRequest request;

    protected HttpServletResponse response;

    protected HttpSession session;

    @ModelAttribute
    public void setReqAndResp(HttpServletRequest request, HttpServletResponse response){
        this.request = request;
        this.response = response;
        this.session = request.getSession();
    }

    /**
     * 获取登录用户
     * @return
     */
    public WordUser getWordUser(){
        return (WordUser) UserUtil.get();
    }

    /**
     * 获取OA用户
     * @return
     */
    public OaUser getOaUser(){
        String session = (String)request.getSession().getAttribute(LeafConstant.SESSION_USER);
        return StringUtils.isBlank(session) ? null : JsonUtil.toBean(session, OaUser.class);
    }
}
