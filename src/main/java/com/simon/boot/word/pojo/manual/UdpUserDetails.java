package com.simon.boot.word.pojo.manual;

import com.simon.boot.word.framework.kits.LeafConstant;
import com.simon.boot.word.pojo.udp.UdpUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author simon.wei
 */
public class UdpUserDetails implements UserDetails {

    private UdpUser user;

    public UdpUserDetails(UdpUser user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限集合
        return null;
    }

    @Override
    public String getPassword() {
        return user.getUserPassword();
    }

    @Override
    public String getUsername() {
        return user.getId().toString().concat(LeafConstant.PROJECT_UDP);
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
