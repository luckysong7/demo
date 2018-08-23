package com.score6_0716;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBConn;

public class Score {
	String hak, name;
	int kor, eng, mat, tot, avg;
	String str;

	Scanner sc = new Scanner(System.in);

	// 1. �Է�
	public int insertData() {
		int result = 0;

		Connection conn = DBConn.getConnection();

		Statement stmt = null;

		String sql;
		try {
			System.out.print("�й� ? ");
			hak = sc.next();
			System.out.print("�̸� ? ");
			name = sc.next();

			System.out.print("���� ? ");
			kor = sc.nextInt();
			System.out.print("���� ? ");
			eng = sc.nextInt();
			System.out.print("���� ? ");
			mat = sc.nextInt();

			sql = "insert into score(hak,name,kor,eng,mat) values(";
			sql += "'" + hak + "',";
			sql += "'" + name + "',";
			sql += kor + ",";
			sql += eng + ",";
			sql += mat + ")";

			System.out.println(sql);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

			stmt.close();
			System.out.println("������ �Է� �Ϸ� !!");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	// 2. ����
	public int updateData() {
		int result = 0;

		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql;
		try {
			System.out.print("�й� ? ");
			hak = sc.next();
			System.out.print("���� ? ");
			kor = sc.nextInt();
			System.out.print("���� ? ");
			eng = sc.nextInt();
			System.out.print("���� ? ");
			mat = sc.nextInt();

			sql = "update score set kor = " + kor + ",eng =" + eng + ",mat ="
					+ mat + "where hak = '" + hak + "'";
			System.out.println(sql);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

			stmt.close();
			System.out.println("������ ���� �Ϸ� !");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	// 3. ����
	public int deleteData() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql;

		try {
			System.out.println("�й� ? ");
			hak = sc.next();
			sql = "delete score where hak = '" + hak + "'";

			System.out.println(sql);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			stmt.close();

			System.out.println("������ ���� �Ϸ� ");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// 4. ��ü���
	public int selectAll() {

		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql;
		try {
			sql = "select hak,name,kor,eng,mat, (kor+eng+mat) tot, (kor+eng+mat)/3 avg "
					+ "from score order by hak";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("       �й�   �̸�  ����  ����  ����  ����  ���");
			while (rs.next()) {
				hak = rs.getString(1);
				name = rs.getString("name");
				kor = rs.getInt("kor");
				eng = rs.getInt("eng");
				mat = rs.getInt("mat");
				tot = rs.getInt("tot");
				avg = rs.getInt("avg");
				// Į����, ���� �Ѵ� ��밡�� / ȸ�翡���� Į�������� ���� ���

				str = String.format("%10s %10s %4d %4d %4d %4d %4d", hak, name,
						kor, eng, mat, tot, avg);

				System.out.println(str);
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	// 5. �̸��˻�
	public void searchData() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql;

		System.out.print("�˻��� �̸� ? ");
		String n = sc.next();

		try {
			sql = "select hak,name,kor,eng,mat from score where name = '" + n
					+ "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("     �й�      �̸�  ����   ����   ����");
			while(rs.next()){
			hak = rs.getString("hak");
			name = rs.getString("name");
			kor = rs.getInt("kor");
			eng = rs.getInt("eng");
			mat = rs.getInt("mat");
			str = String.format("%10s %10s %4d %4d %4d", hak, name,
					kor, eng, mat);

			System.out.println(str);
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

