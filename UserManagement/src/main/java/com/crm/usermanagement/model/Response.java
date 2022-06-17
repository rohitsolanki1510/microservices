package com.crm.usermanagement.model;

public class Response<T> {

	private T data;
	
	private String responseCode;
	
	private String responseDesciption;

	public Response() {
	}

	
	public Response(T data, String responseCode, String responseDesciption) {
		this.data = data;
		this.responseCode = responseCode;
		this.responseDesciption = responseDesciption;
	}


	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDesciption() {
		return responseDesciption;
	}

	public void setResponseDesciption(String responseDesciption) {
		this.responseDesciption = responseDesciption;
	}
	
	
	
	
}
