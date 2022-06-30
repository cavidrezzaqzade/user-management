package com.springbank.user.cmd.api.dto;

/**
 * @author caci
 * @since 30.06.2022
 */

public class RegisterUserResponse extends BaseResponse{
    private String id;

    public RegisterUserResponse(String message){
        super(message);
    }
}
