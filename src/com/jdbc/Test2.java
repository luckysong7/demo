package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.db.DBConn;

public class Test2 {
	public static void main(String[] args) {
		Connection conn = DBConn.getConnection();
		if(conn == null){
			System.out.println("�����ͺ��̽� ���� ���� !!");
			System.exit(0);
		}
		
		// DB���� 
		// 1. DriverManager �� Connection�� ����
		// 2. Connection�� Statement �� ����
		
		// 3. Statement �� query �� ����

		try {
			// 2. Connection�� Statement �� ����
			// SQL ������ �����ϴ� �������̽� 	
			Statement stmt = conn.createStatement();
			String sql;
			
//			sql = "insert into score (hak,name, kor, eng, mat) "; // �ڿ� �ݵ�� ��ĭ �ٱ� 
//			sql += "values ('111','�����',90,50,60)";

//			sql = "update score set kor = 99, eng = 99 , mat = 99 ";
//			sql += "where hak = 111";
			
			sql = "delete score where hak = 111";
			int result = stmt.executeUpdate(sql);// insert, upate, delete �� ������ executeUpdate
			
			if(result == 1){
				System.out.println("���� ���� !!");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		DBConn.close();
	
	
	}
}
