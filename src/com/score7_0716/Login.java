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
	
// 1. 회원가입
	public int signUp() throws ParseException {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;

		String sql;

		try {
			System.out.print("아이디 ? ");
			id = sc.next();
			System.out.print("비밀번호 ? ");
			pwd = sc.next();
			System.out.print("이름 ? ");
			name = sc.next();
			System.out.print("생일 ? ");
			birth = sc.next();
			System.out.print("전화번호 ? ");
			tel = sc.next();
			System.out.print("메모 ? ");
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
			System.out.println("아이디가 이미 존재합니다.");
		} catch (SQLException e3) {
			System.out.println(e3.toString());
		}
		return result;
	}
	
// 2. 전체출력
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
	
// 3. 이름검색
	public int searchName() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql;

		String str;
		String n;
		System.out.print("검색할 회원의 이름 ? ");
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
	
// 4. 회원정보 수정 
	public int updateMember(){
		int result = 0 ;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql ;
		
		try {
			System.out.print("업데이트 할 회원의 아이디 ? ");
			id = sc.next();
			System.out.println("비밀번호 ? ");
			pwd = sc.next();
			System.out.println("생일 ? ");
			birth = sc.next();
			System.out.println("전화번호 ? ");
			tel = sc.next();
			System.out.println("메모 ? ");
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
// 5. 회원 삭제
	public int deleteMember(){
		int result = 0 ; 
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql ;
		
		try {
			System.out.print("삭제할 아이디 ? ");
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
