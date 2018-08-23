package com.exec;

public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg); // 오버로딩 생성자 호출
	}

}
