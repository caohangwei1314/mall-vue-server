package com.caohangwei.mallvueserver.base;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class BaseController {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResponse defaultErrorHandler(Exception e){
        return BaseResponse.createError(-1,e.getMessage());
    }
}
