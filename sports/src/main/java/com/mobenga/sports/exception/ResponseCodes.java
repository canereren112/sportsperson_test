package com.mobenga.sports.exception;


public enum ResponseCodes {
	SUCCESS(0, "The Operation has been succeeded."),
	ERROR(1, "System Error occured."),
	SPORTS_PERSON_NOT_FOUND(2, "The sportsperson could not be found."),
	SPORTS_PERSON_MALFORMED_ID (3,"The sportsperson id is malformed."),
	NUMBER_FORMAT_ERROR(4,"There is an error during the format conversion."),
	DATA_EXCEEDS_ERROR(5, "The given data for the process is malformed."),
	FILE_NOT_FOUND_ERROR(6,"The file can not be found."),
	INPUT_OUTPUT_ERROR(7, "There is a problem while reading or writing the file."),
	FILE_READ_ERROR(8, "An error occurerd while reading the file."),
	MAP_ADD_OPERATION_ERROR(9, "An error occured while adding data to the map. ");
	
	public final String message;

	public final int errorCode;

	public final boolean includeExceptionDetail;


	ResponseCodes() {
		message="Sistem Failure";
		errorCode=999;
		includeExceptionDetail=false;
	}

	
	ResponseCodes(String msg) {
		this.message = msg;
		this.errorCode = ordinal();
		this.includeExceptionDetail=false;
	}

	
	ResponseCodes(int errorCode, String msg) {
		this.message = msg;
		this.errorCode = errorCode;
		this.includeExceptionDetail=false;
	}

	
	ResponseCodes(int errorCode, String msg, boolean includeExceptionDetail) {
		this.message = msg;
		this.errorCode = errorCode;
		this.includeExceptionDetail = includeExceptionDetail;
	}


	public String message() {
		return message;
	}

	
	public static ResponseCodes forErrorCode(int errorCode) {
		ResponseCodes[] errors = ResponseCodes.values();
		for (ResponseCodes ec : errors) {
			if (ec.errorCode == errorCode) {
				return ec;
			}
		}
		return ERROR;
	}

	
	public static ResponseCodes forOrdinal(int ordinal) {
		ResponseCodes[] errors = ResponseCodes.values();
		for (ResponseCodes ec : errors) {
			if (ec.ordinal() == ordinal) {
				return ec;
			}
		}
		return ERROR;
	}
}
