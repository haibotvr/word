package com.simon.boot.word.framework.kits;

import com.simon.boot.word.framework.abstracts.AbstractUser;

/**
 * @author simon.wei
 */
public class UserUtil {

    private UserUtil() {}

    private static final ThreadLocal<AbstractUser> userInfo = new ThreadLocal<>();

    public static void set(AbstractUser user) {
        userInfo.set(user);
    }

    public static AbstractUser get() {
        return userInfo.get();
    }

    public static void remove() {
        userInfo.remove();
    }

}
