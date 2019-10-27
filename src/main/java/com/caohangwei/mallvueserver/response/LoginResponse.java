package com.caohangwei.mallvueserver.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class LoginResponse {

    private String username;

    private String phone;

    private String mail;

    private String token;
}
