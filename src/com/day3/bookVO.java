package com.day3;

import java.io.Serializable;

public class bookVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String bookName;
	int rentTime;
	int returnTime;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getRentTime() {
		return rentTime;
	}
	public void setRentTime(int rentTime) {
		this.rentTime = rentTime;
	}
	public int getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(int returnTime) {
		this.returnTime = returnTime;
	}
	
	
	
	
}
