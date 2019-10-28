package com.caohangwei.mallvueserver.response.admin;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LoginResponse {

    private String token;

    private String name;
}
