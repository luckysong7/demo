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

	// 1. 입력
	public int insertData() {
		int result = 0;

		Connection conn = DBConn.getConnection();

		Statement stmt = null;

		String sql;
		try {
			System.out.print("학번 ? ");
			hak = sc.next();
			System.out.print("이름 ? ");
			name = sc.next();

			System.out.print("국어 ? ");
			kor = sc.nextInt();
			System.out.print("영어 ? ");
			eng = sc.nextInt();
			System.out.print("수학 ? ");
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
			System.out.println("데이터 입력 완료 !!");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	// 2. 수정
	public int updateData() {
		int result = 0;

		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql;
		try {
			System.out.print("학번 ? ");
			hak = sc.next();
			System.out.print("국어 ? ");
			kor = sc.nextInt();
			System.out.print("영어 ? ");
			eng = sc.nextInt();
			System.out.print("수학 ? ");
			mat = sc.nextInt();

			sql = "update score set kor = " + kor + ",eng =" + eng + ",mat ="
					+ mat + "where hak = '" + hak + "'";
			System.out.println(sql);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

			stmt.close();
			System.out.println("데이터 수정 완료 !");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	// 3. 삭제
	public int deleteData() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql;

		try {
			System.out.println("학번 ? ");
			hak = sc.next();
			sql = "delete score where hak = '" + hak + "'";

			System.out.println(sql);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			stmt.close();

			System.out.println("데이터 삭제 완료 ");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// 4. 전체출력
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

			System.out.println("       학번   이름  국어  영어  수학  총합  평균");
			while (rs.next()) {
				hak = rs.getString(1);
				name = rs.getString("name");
				kor = rs.getInt("kor");
				eng = rs.getInt("eng");
				mat = rs.getInt("mat");
				tot = rs.getInt("tot");
				avg = rs.getInt("avg");
				// 칼럼명, 숫자 둘다 사용가능 / 회사에서는 칼럼명으로 많이 사용

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

	// 5. 이름검색
	public void searchData() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql;

		System.out.print("검색할 이름 ? ");
		String n = sc.next();

		try {
			sql = "select hak,name,kor,eng,mat from score where name = '" + n
					+ "'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("     학번      이름  국어   영어   수학");
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

