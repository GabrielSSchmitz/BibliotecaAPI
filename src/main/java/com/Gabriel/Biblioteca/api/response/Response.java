package com.Gabriel.Biblioteca.api.response;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {

	private T data;
	List<String> errors;

	public Response() {
		// TODO Auto-generated constructor stub
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErrors() {
		if (this.errors == null) {
			this.errors = new ArrayList<String>();
		}
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "Response [data=" + data + ", errors=" + errors + "]";
	}

}
