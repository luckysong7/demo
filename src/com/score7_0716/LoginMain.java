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
						.println("1. ȸ������ 2. ȸ���˻� 3. ��ü ȸ�� ��� 4. ȸ������ ���� 5. ȸ�� ���� 6. ����");
				ch = sc.nextInt();

			} while (ch < 1 || ch > 6);

			switch (ch) {
			case 1:
				if (ob.signUp() != 0) {
					System.out.println(" ȸ������ ���� ! ");
				} else {
					System.out.println("ȸ������ ����... ");
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
					System.out.println("������Ʈ ���� ! ");
				}else{
					System.out.println("������Ʈ ����...");
				}
				break;
			case 5:
				if(ob.deleteMember() != 0){
					System.out.println("���� ���� ! ");
					
				}else {
					System.out.println("���� ����... ");
				}
				break;
			case 6:
				DBConn.close();
				System.exit(0);

			}

		}

	}
}
