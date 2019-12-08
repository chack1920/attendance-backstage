package com.meterbox.attendance.backstage.enums;

/**
 * 
 * @Description 返回出去统一编码及信息枚举类
 * @Author CEM
 * @Date 2019/12/08 09:10
 *
 */
public enum ReturnCode {
	
	SUCCESS("E_0000_0000", "操作成功!"),
	SYSTEM_EXCEPTION("E_0001_0001", "系统繁忙请稍后再试！"),
	ERROR("E_0001_9999", "操作失败!"),

	BAD_REQUEST("E_0001_0400", "坏的请求!"),
	UNAUTHORIZED("E_0001_0401", "未授权！"),
	FORBIDDEN("E_0001_0403", "无权限访问！"),
	METHOD_NOT_ALLOWED("E_0001_0405", "请求方法不支持！"),
	UNSUPPORTED_MEDIA_TYPE("E_0001_0415", "不支持的媒体类型！"),

	SQL_EXCEPTION("E_0001_0500", "SQL异常！"),

	BUSINESS_EXCEPTION("E_0001_0600", "业务异常！"),
	PARAMETER_NULL("E_0001_0601", "参数为空！"),
	PARAMETER_ILLEGAL("E_0001_0602", "参数不合法！"),
	DATA_TO_JSON("E_0001_0603", "数据转化成JSON格式异常！"),
	DATA_EMPTY("E_0001_0604", "获取数据为空！"),

	NAME_PASSWORD_ERROR("E_0001_0701", "用户名或密码错误!"),
	PASSWORD_ERROR("E_0001_0702", "密码错误!"),

	SMS_VERIFYCODE_EXPIRE("E_0001_0720", "短信验证码已过期，请重新发送!"),
	SMS_VERIFYCODE_ERROR("E_0001_0721", "短信验证码输入不正确!"),
	SMS_VERIFYCODE_MAX("E_0001_0722", "发送短信次数大于当天最大可发送次数!"),
	SMS_VERIFYCODE_TOO_OFTEN("E_0001_0723", "发送短信太频繁，请稍后再试!"),

	USER_NOT_EXIST("E_0001_0732", "用户不存在!"),


	;



	private String code;
	private String msg;
	
	private ReturnCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}

}
