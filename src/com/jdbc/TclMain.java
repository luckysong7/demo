package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBConn;

public class TclMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql;

		int ch, id;
		String name, birth, tel;
		try {
			while (true) {
				do {
					System.out.print("1.�Է� 2.��� 3.����");
					ch = sc.nextInt();

				} while (ch < 1 || ch > 3);

				switch (ch) {
				case 1:
					conn.setAutoCommit(false);
					System.out.print("���̵�(����) ? ");
					id = sc.nextInt();
					System.out.print("�̸� ? ");
					name = sc.next();

					System.out.println("����(YYYY-MM-DD) ? ");
					birth = sc.next();

					System.out.println("��ȭ ? ");
					tel = sc.next();
					// �۾�1--------------------------------------------------------------
					sql = String.format(
							"insert into test1(id,name) values(%d,'%s')", id,
							name);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					stmt.close();
					// �۾�2--------------------------------------------------------------
					sql = String.format(
							"insert into test2(id,birth) values(%d,'%s')", id,
							birth);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					stmt.close();
					// �۾�3-----------------------------------------------------------
					sql = String.format(
							"insert into test3(id,tel) values(%d,'%s')", id,
							tel);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					stmt.close();

					conn.commit();
					// -----------------------------------------------------------------
				case 2:
					break;

				case 3:
					DBConn.close();
					System.exit(0);
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
