package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBConn;

// ��ũ�� ������ Ŀ�� 
// ������ ��ġ�� ������ �������� �̵������� Ŀ�� 

public class Test3 {
	public static void main(String[] args) {
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql;
		

		try {
			sql = "select hak, name from score";
			// stmt = conn.createStatement(); // ���������θ� �̵�����
			// stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
			// ResultSet.CONCUR_READ_ONLY);
			// TYPE_SCROLL_SENSITIVE : ������� �ٷ� �ݿ���
			// TYPE_SCROLL_INSENSITIVE : ������� �ٷ� �ݿ� �ȵ�
			// CONCUR_READ_ONLY : �б�����
			// CONCUR_UPDATABLE : ��������

			// ��������, ������, �����Ⱑ�� �ٷ� �������� �ݿ�
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);

			rs = stmt.executeQuery(sql);
			char ch;
			while (true) {
				do {
					System.out.println("1.ó�� 2. ���� 3. ���� 4. ������ 5. ����");
					ch = (char) System.in.read();
					System.in.skip(2);

				} while (ch <'1' || ch > '5');
				switch (ch) {
				case '1':
					if (rs.first()) {
						System.out.println("ó�� : " + rs.getString(1) + " : "
								+ rs.getString(2));
					}
					break;

				case '2':
					if (rs.previous()) {
						System.out.println("���� : " + rs.getString(1) + " : "
								+ rs.getString(2));
					}
					break;
				case '3':
					if (rs.next()) {
						System.out.println("���� : " + rs.getString(1) + " : "
								+ rs.getString(2));
					}
					break;
				case '4':
					if (rs.last()) {
						System.out.println("������ : " + rs.getString(1) + " : "
								+ rs.getString(2));
					}
					break;
				case '5':
				default:
					rs.close();
					stmt.close();
					DBConn.close();
					System.exit(0);
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
