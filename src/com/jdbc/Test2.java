package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.db.DBConn;

public class Test2 {
	public static void main(String[] args) {
		Connection conn = DBConn.getConnection();
		if(conn == null){
			System.out.println("데이터베이스 연결 실패 !!");
			System.exit(0);
		}
		
		// DB연결 
		// 1. DriverManager 가 Connection을 생성
		// 2. Connection이 Statement 를 생성
		
		// 3. Statement 가 query 를 실행

		try {
			// 2. Connection이 Statement 를 생성
			// SQL 구분을 실행하는 인터페이스 	
			Statement stmt = conn.createStatement();
			String sql;
			
//			sql = "insert into score (hak,name, kor, eng, mat) "; // 뒤에 반드시 한칸 뛰기 
//			sql += "values ('111','배수지',90,50,60)";

//			sql = "update score set kor = 99, eng = 99 , mat = 99 ";
//			sql += "where hak = 111";
			
			sql = "delete score where hak = 111";
			int result = stmt.executeUpdate(sql);// insert, upate, delete 는 무조건 executeUpdate
			
			if(result == 1){
				System.out.println("삭제 성공 !!");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		DBConn.close();
	
	
	}
}
