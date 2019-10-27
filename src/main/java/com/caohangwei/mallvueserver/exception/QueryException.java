package com.caohangwei.mallvueserver.exception;

public class QueryException extends RuntimeException {

    public QueryException(){

    }

    public QueryException(String msg){
        super(msg);
    }
}
