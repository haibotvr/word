package com.simon.boot.word.pojo.manual;

import com.simon.boot.word.eumn.UserStatus;
import com.simon.boot.word.pojo.WordPermission;
import com.simon.boot.word.pojo.WordUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author simon.wei
 */
public class WordUserDetails implements UserDetails {

    private WordUser user;

    private List<WordPermission> permissions;

    public WordUserDetails(WordUser user, List<WordPermission> permissions) {
        this.user = user;
        this.permissions = permissions;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限集合
        return permissions.stream()
                .filter(permission -> permission.getValue() != null)
                .map(permission -> new SimpleGrantedAuthority(permission.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return user.getLoginPassword();
    }

    @Override
    public String getUsername() {
        return user.getLoginName();
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
        return user.getEwStatus().equals(UserStatus.AVAILABLE.getValue());
    }
}
