package com.springbank.user.cmd.api.security;

/**
 * @author caci
 * @since 29.06.2022
 */

public interface PasswordEncoder {
    String hashPassword(String password);
}
