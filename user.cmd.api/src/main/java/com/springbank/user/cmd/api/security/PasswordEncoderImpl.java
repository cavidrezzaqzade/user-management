package com.springbank.user.cmd.api.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author caci
 * @since 29.06.2022
 */

@Service
public class PasswordEncoderImpl implements PasswordEncoder {

    @Override
    public String hashPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
        String hashedPassword = encoder.encode(password);

        return hashedPassword;
    }
}
