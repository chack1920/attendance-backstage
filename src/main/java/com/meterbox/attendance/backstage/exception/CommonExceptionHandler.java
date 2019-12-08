package com.meterbox.attendance.backstage.exception;


import com.meterbox.attendance.backstage.common.Result;
import com.meterbox.attendance.backstage.enums.ReturnCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.AccessDeniedException;
import java.sql.SQLException;

/**
 * @Description: 统一异常处理类
 * @Author: CEM
 * @Date: 2019/12/08 09:00
 **/
@Slf4j
@RestControllerAdvice
public class CommonExceptionHandler {

    /**
     * Exception异常处理
     */
    @ExceptionHandler(value = Exception.class)
    public Result exceptionHandler(Exception e) {
        log.error("system error:" + e);
        return new Result(ReturnCode.SYSTEM_EXCEPTION);
    }

    /**
     * IllegalArgumentException异常处理
     */
    @ExceptionHandler({IllegalArgumentException.class})
    public Result badRequestException(IllegalArgumentException e) {
        return new Result(ReturnCode.PARAMETER_ILLEGAL);
    }

    /**
     * AccessDeniedException异常处理
     * 返回状态码:403
     */
    @ExceptionHandler({AccessDeniedException.class})
    public Result badMethodExpressException(AccessDeniedException e) {
        return new Result(ReturnCode.FORBIDDEN);
    }

    /**
     * HttpRequestMethodNotSupportedException异常处理
     */
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public Result handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        return new Result(ReturnCode.METHOD_NOT_ALLOWED);
    }

    /**
     * HttpMediaTypeNotSupportedException异常处理
     */
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    @ExceptionHandler({HttpMediaTypeNotSupportedException.class})
    public Result handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
        return new Result(ReturnCode.UNSUPPORTED_MEDIA_TYPE);
    }

    /**
     * SQLException异常处理
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({SQLException.class})
    public Result handleSQLException(SQLException e) {
        return new Result(ReturnCode.SQL_EXCEPTION);
    }

}
