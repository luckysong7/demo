package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.db.DBConn;

// �ش� �����Ϳ� ���� ������ �����ִ� ������
// DB���� �����Ϳ� ���� ������, ������ ũ�� ��

public class MetaTest {
	public static void main(String[] args) {
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs= null;
		ResultSetMetaData rsmd = null;
		String sql;
		
		try {
			sql = "select hak,name,kor,eng,mat from score";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			rsmd = rs.getMetaData();
			
			// �÷��� 
			int cols = rsmd.getColumnCount();
			for(int i = 1 ; i <= cols ; i++){
				System.out.print("�÷��� : " + rsmd.getColumnName(i)+ " | ");
				
				System.out.print("�÷�Ÿ�� :" + rsmd.getColumnType(i));
				
				System.out.print(" | �÷�Ÿ�Ը� : " + rsmd.getColumnTypeName(i));
				
				System.out.println(" | �÷��� : " + rsmd.getPrecision(i));
				
				System.out.println();
				
			}
			
			while(rs.next()){
				for(int i = 1 ; i <= cols ; i++){
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			
			rs.close();
			stmt.close();
			DBConn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
