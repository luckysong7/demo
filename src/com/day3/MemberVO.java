package com.day3;

import java.io.Serializable;
import java.util.List;

public class MemberVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id; // 아이디
	private String pw; // 비밀번호
	private String name; // 이름
	private String address; // 주소
	private String tel; // 휴대폰번호

	// List<bookVO> bookList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	// @Override
	// public String toString() {
	// return String.format("%11s %20s %42s %24s", name, tel, address,
	// bookList);
	//
	// }

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
