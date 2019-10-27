package com.caohangwei.mallvueserver.request;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
public class LoginRequest {

    private String phone;

    private String password;
}
