package com.caohangwei.mallvueserver.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 通用返回类
 *
 * @author PinuoC
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {

    private int rcode;

    private String message;

    private Object data;

    public static BaseResponse createSuccess(){
        return createSuccess(null);
    }

    public static BaseResponse createSuccess(Object data){
        return new BaseResponse(0,"成功",data);
    }

    public static BaseResponse createError(int rcode,String message){
        return new BaseResponse(rcode,message,null);
    }
}
