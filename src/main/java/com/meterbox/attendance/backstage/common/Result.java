package com.meterbox.attendance.backstage.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.meterbox.attendance.backstage.enums.ReturnCode;
import lombok.Data;

/**
 * @Description: RESTful接口统一返回对象
 * @Author: CEM
 * @Date: 2019/12/08 09:20
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

    private String code = ReturnCode.SUCCESS.getCode();
    private String msg = ReturnCode.SUCCESS.getMsg();
    private Object data;

    public Result() {
    }

    public Result(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(ReturnCode returnCode) {
        this.code = returnCode.getCode();
        this.msg = returnCode.getMsg();
    }

    public Result(Object data) {
        if (data instanceof ReturnCode) {
            ReturnCode returnCode = (ReturnCode)data;
            this.code = returnCode.getCode();
            this.msg = returnCode.getMsg();
        } else {
            this.data = data;
        }
    }

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(ReturnCode returnCode, Object data) {
        this.code = returnCode.getCode();
        this.msg = returnCode.getMsg();
        this.data = data;
    }


}
