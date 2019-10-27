package com.caohangwei.mallvueserver.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
@Slf4j
public class BaseController {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResponse defaultErrorHandler(Exception e){
        log.info("[Error] " + e.getMessage());
        return BaseResponse.createError(-1,e.getMessage());
    }
}
