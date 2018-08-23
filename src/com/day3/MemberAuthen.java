package com.day3; 

public class MemberAuthen {
	
	//아이디 체크 메소드 
	public void inputID(String id) throws Exception {

		if (id.length() < 8 || id.length() > 15) {
			throw new Exception("8~15자리 이내로  입력해주세요. " + "\n방금 적으신 아이디 : "
					+ "[" + id + "]" + " (은)는 " + id.length() + " 자리입니다.");
		}

		int eng = 0;
		int num = 0;

		for (int i = 0; i < id.length(); i++) {

			char ch = id.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				eng++;
			else if (ch >= '0' && ch <= '9')
				num++;
		}

		if (eng == 0 || num == 0) {
			throw new Exception("영문자 및 숫자를 사용하여 만들어주세요.");
		}
	}

	// 비밀번호 체크 메소드
	public void inputPW(String pw) throws Exception {

		if (pw.length() < 8) {
			throw new Exception("8자 이상의 비밀번호를 입력하세요! :" + "\n방금 적으신 비밀번호 : "
					+ "[" + pw + "]" + "(은)는" + "[" + pw.length() + "]"
					+ " 자리입니다.");
		}

		boolean flag1 = false;
		boolean flag2 = false;

		for (int i = 0; i < pw.length(); i++) {

			char c = pw.charAt(i);

			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				flag1 = true;
			} else if (c >= '0' && c <= '9') {
				flag2 = true;
			} else {
				throw new Exception("영문자 및 숫자만 가능합니다.");
			}
		}
		if (flag1 == false || flag2 == false) {
			throw new Exception("영문자와 숫자를 사용하여 비밀번호를 만들어주세요.");
		}
	}
	
	// 1번 비밀번호와 2번 비밀번호가 같은지 체크 메소드
	public void checkingPW(String pw1, String pw2) throws Exception {
		if (!pw1.equals(pw2) && (!(pw1 == pw2))) {
			throw new Exception("비밀번호가 서로 일치 하지 않습니다.");
		}
	}

}
