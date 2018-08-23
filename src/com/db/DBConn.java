package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	private static Connection dbConn;

	// 연결하기
	public static Connection getConnection() {
		if (dbConn == null) {
			try {
				String url = "jdbc:oracle:thin:@192.168.16.26:1521:TestDB"; // 오라클의
																			// 포트번호
																			// 1521
				String user = "suzi";
				String pwd = "a123";

				Class.forName("oracle.jdbc.driver.OracleDriver");

				dbConn = DriverManager.getConnection(url, user, pwd);

			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		return dbConn;
	}

	// 연결해제
	public static void close() {

		if (dbConn != null) {
			try {
				if(!dbConn.isClosed()){
					dbConn.close();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		dbConn = null;
		
	}
}
