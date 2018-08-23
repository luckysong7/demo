package com.score8_0717;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

public class ScoreDAO { // Data Access Object

	// 1. �Է�
	public int insertData(ScoreDTO dto) {
		int result = 0;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {
			sql = "insert into score (hak, name, kor, eng,mat)";
			sql += "values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql); // �̸� �������صд�.
			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// 2. ����
	public int updateData(ScoreDTO dto) {
		int result = 0;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {
			sql = "update score set kor = ? , eng = ? , mat = ? where hak = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setString(4, dto.getHak());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// 3. ����
	public int deleteData(String hak) {
		int result = 0;
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;

		String sql;
		try {
			sql = "delete score where hak = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hak);

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}

	// 4. select
	// �������� ������ŭ DTO �� �ʿ� -> List�� ��´� !
	public List<ScoreDTO> selectAllData() {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet res;
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>(); // DTO Ÿ���� list��ü����
		String sql;

		try {
			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot, (kor+eng+mat)/3 ave, rank() over(order by (kor+eng+mat) desc) rank from score";
			pstmt = conn.prepareStatement(sql);

			res = pstmt.executeQuery();

			// ������ ����� �𸣸� while �� ����
			while (res.next()) {
				ScoreDTO dto = new ScoreDTO();
				dto.setHak(res.getString("hak"));
				dto.setName(res.getString("name"));
				dto.setKor(res.getInt("kor"));
				dto.setEng(res.getInt("eng"));
				dto.setMat(res.getInt("mat"));
				dto.setTot(res.getInt("tot"));
				dto.setAve(res.getInt("ave"));
				dto.setRank(res.getInt("rank"));

				lists.add(dto);

			}
			res.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;
	}

	// 5. �й��˻�
	public ScoreDTO selectData(String hak) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet res;
		String sql;
		ScoreDTO dto = null;

		try {
			sql = "select hak, name, kor, eng, mat, (kor+eng+mat) tot, (kor+eng+mat)/3 ave, rank() over(order by (kor+eng+mat) desc) rank from score where hak = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hak);
			res = pstmt.executeQuery();
			
			if (res.next()) {
				dto = new ScoreDTO();
				dto.setHak(res.getString("hak"));
				dto.setName(res.getString("name"));
				dto.setKor(res.getInt("kor"));
				dto.setEng(res.getInt("eng"));
				dto.setMat(res.getInt("mat"));
				dto.setTot(res.getInt("tot"));
				dto.setAve(res.getInt("ave"));
				dto.setRank(res.getInt("rank"));
			}
			res.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return dto;
	}

}
