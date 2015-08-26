package com.mobenga.sports.exception;

import java.io.Serializable;



public class ServiceResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private int errorCode;

	private String message;

	
	public ServiceResponse() {
	}

	
	public ServiceResponse(int errorCode, String msg) {
		this.setMessage(msg);
		this.setErrorCode(errorCode);
	}

	
	public ServiceResponse(ResponseCodes error) {
		this.message = error.message;
		this.errorCode = error.errorCode;
	}

	
	public ServiceResponse(ServiceRuntimeException e) {
		this.errorCode = e.getErrCode();
		this.message = e.getErrMsg();
	}

	
	public void setMessage(String message) {
		this.message = message;
	}

	
	public String getMessage() {
		return message;
	}

	
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	
	public int getErrorCode() {
		return errorCode;
	}

}
