package com.score7_0716;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.db.DBConn;

public class Login {
	String id, pwd, name, tel, memo;
	String birth;
	Scanner sc = new Scanner(System.in);
	
// 1. ȸ������
	public int signUp() throws ParseException {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;

		String sql;

		try {
			System.out.print("���̵� ? ");
			id = sc.next();
			System.out.print("��й�ȣ ? ");
			pwd = sc.next();
			System.out.print("�̸� ? ");
			name = sc.next();
			System.out.print("���� ? ");
			birth = sc.next();
			System.out.print("��ȭ��ȣ ? ");
			tel = sc.next();
			System.out.print("�޸� ? ");
			memo = sc.next();


			sql = "insert into member (id, pwd, name, birth, tel, memo) values("
					+ "'"
					+ id
					+ "',"
					+ "'"
					+ pwd
					+ "',"
					+ "'"
					+ name
					+ "',"
					+ "to_date('"
					+ birth
					+ "','YYYY-MM-DD'),'"
					+ tel
					+ "',"
					+ "'" + memo + "')";

			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			stmt.close();

		} catch (SQLIntegrityConstraintViolationException e2) {
			System.out.println("���̵� �̹� �����մϴ�.");
		} catch (SQLException e3) {
			System.out.println(e3.toString());
		}
		return result;
	}
	
// 2. ��ü���
	public int selectAll() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql;
		String str;

		try {
			sql = "select id, pwd, name, to_char(birth,'YYYY-MM-DD') birth, tel, memo from member order by id";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				id = rs.getString("id");
				pwd = rs.getString("pwd");
				name = rs.getString("name");
				birth = rs.getString("birth");
				tel = rs.getString("tel");
				memo = rs.getString("memo");

				str = String.format("%15s %15s %15s %15s %15s %20s", id, pwd,
						name, birth, tel, memo);
				System.out.println(str);
			}
			rs.close();
			stmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}
	
// 3. �̸��˻�
	public int searchName() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql;

		String str;
		String n;
		System.out.print("�˻��� ȸ���� �̸� ? ");
		n = sc.next();

		try {
			sql = "select id, pwd, name, to_char(birth) birth, tel, memo from member where name = '" + n + "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				id = rs.getString("id");
				pwd = rs.getString("pwd");
				name = rs.getString("name");
				birth = rs.getString("birth");
				tel = rs.getString("tel");
				memo = rs.getString("memo");

				str = String.format("%15s %15s %15s %15s %15s %15s", id, pwd, name, birth, tel, memo);
				System.out.println(str);
			}
			rs.close();
			stmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}
	
// 4. ȸ������ ���� 
	public int updateMember(){
		int result = 0 ;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql ;
		
		try {
			System.out.print("������Ʈ �� ȸ���� ���̵� ? ");
			id = sc.next();
			System.out.println("��й�ȣ ? ");
			pwd = sc.next();
			System.out.println("���� ? ");
			birth = sc.next();
			System.out.println("��ȭ��ȣ ? ");
			tel = sc.next();
			System.out.println("�޸� ? ");
			memo = sc.next();
			
			sql = "update member set pwd = '" + pwd +"', tel = '" + tel + "', memo ='" + memo
					+ "',birth = to_date('"+birth +"','YYYY-MM-DD') where id = '" + id +"'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result ;
		
	}
// 5. ȸ�� ����
	public int deleteMember(){
		int result = 0 ; 
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql ;
		
		try {
			System.out.print("������ ���̵� ? ");
			id = sc.next();
			
			sql = "delete member where id = '" + id + "'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			stmt.close();
		
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}
}
