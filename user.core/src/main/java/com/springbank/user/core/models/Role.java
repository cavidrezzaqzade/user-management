package com.springbank.user.core.models;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author caci
 * @since 29.06.2022
 */

public enum Role implements GrantedAuthority {
    READ_PRIVILEGE, WRITE_PRIVILEGE;

    @Override
    public String getAuthority() {
        return name();
    }
}
