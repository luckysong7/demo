package com.score7_0716;

import java.text.ParseException;
import java.util.Scanner;

import com.db.DBConn;

public class LoginMain {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Login ob = new Login();
		int ch;
		while (true) {
			do {
				System.out
						.println("1. 회원가입 2. 회원검색 3. 전체 회원 출력 4. 회원정보 수정 5. 회원 삭제 6. 종료");
				ch = sc.nextInt();

			} while (ch < 1 || ch > 6);

			switch (ch) {
			case 1:
				if (ob.signUp() != 0) {
					System.out.println(" 회원가입 성공 ! ");
				} else {
					System.out.println("회원가입 실패... ");
				}
				break;

			case 2:
				ob.searchName();
				break;

			case 3:
				ob.selectAll();
				break;
			case 4:
				if(ob.updateMember() != 0 ){
					System.out.println("업데이트 성공 ! ");
				}else{
					System.out.println("업데이트 실패...");
				}
				break;
			case 5:
				if(ob.deleteMember() != 0){
					System.out.println("삭제 성공 ! ");
					
				}else {
					System.out.println("삭제 실패... ");
				}
				break;
			case 6:
				DBConn.close();
				System.exit(0);

			}

		}

	}
}
