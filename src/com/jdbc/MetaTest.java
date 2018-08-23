package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.db.DBConn;

// 해당 데이터에 대한 정보를 갖고있는 데이터
// DB내의 데이터에 대한 소유자, 데이터 크기 등

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
			
			// 컬럼수 
			int cols = rsmd.getColumnCount();
			for(int i = 1 ; i <= cols ; i++){
				System.out.print("컬럼명 : " + rsmd.getColumnName(i)+ " | ");
				
				System.out.print("컬럼타입 :" + rsmd.getColumnType(i));
				
				System.out.print(" | 컬럼타입명 : " + rsmd.getColumnTypeName(i));
				
				System.out.println(" | 컬럼폭 : " + rsmd.getPrecision(i));
				
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
