package com.simon.boot.word.pojo.manual;

import com.simon.boot.word.framework.kits.LeafConstant;
import com.simon.boot.word.pojo.oa.OaUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author simon.wei
 */
public class OaUserDetails implements UserDetails {

    private OaUser user;

    public OaUserDetails(OaUser user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限集合
        return null;
    }

    @Override
    public String getPassword() {
        return user.getLoginPassword();
    }

    @Override
    public String getUsername() {
        return user.getId().toString().concat(LeafConstant.PROJECT_OA);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
