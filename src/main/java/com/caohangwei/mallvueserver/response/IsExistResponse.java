package com.caohangwei.mallvueserver.response;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author PinuoC
 */
@Data
@Accessors(chain = true)
public class IsExistResponse {

    private Boolean isExist;

    private String checkNum;
}
