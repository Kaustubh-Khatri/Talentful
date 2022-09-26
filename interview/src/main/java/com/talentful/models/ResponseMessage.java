package com.talentful.models;

public class ResponseMessage {
	public ResponseMessage(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public ResponseMessage()  {}
	int code = 200;
	String message = "successful";
}
