package com.score8_0717;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.OracleTypes;

import com.db.DBConn;

//CallableStatement(���ν���) 

public class ScoreDAO1 { // Data Access Object

	// 1. �Է�
	public int insertData(ScoreDTO dto) {
		int result = 0;

		Connection conn = DBConn.getConnection();

		CallableStatement cstmt = null;
		String sql;

		try {
			sql = "{call insertScore(?,?,?,?,?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, dto.getHak());
			cstmt.setString(2, dto.getName());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// 2. ����
	public int updateData(ScoreDTO dto) {
		int result = 0;

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		
		String sql;

		try {
			sql = "{call updateScore(?,?,?,?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, dto.getHak());
			cstmt.setInt(2, dto.getKor());
			cstmt.setInt(3, dto.getEng());
			cstmt.setInt(4, dto.getMat());

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	// 3. ����
	public int deleteData(String hak) {
		int result = 0;
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;
		try {
			sql = "{call deleteScore(?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, hak);

			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;

	}

	// 4. select
	// �������� ������ŭ DTO �� �ʿ� -> List�� ��´� !
	public List<ScoreDTO> selectAllData() {
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet res;
		List<ScoreDTO> lists = new ArrayList<ScoreDTO>(); // DTO Ÿ���� list��ü����
		String sql;

		try {
			sql = "{call selectAllScore(?)}";
			cstmt = conn.prepareCall(sql);

			// out�Ķ���� �ڷ��� ����
			// �������� ������־�� �� 
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			//���ν��� ����
			cstmt.executeUpdate();
			//out �Ķ������ ���� ��������
			res = (ResultSet) cstmt.getObject(1);
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
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return lists;
	}

	// 5. �й��˻�
	public ScoreDTO selectData(String hak) {
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet res;
		String sql;
		ScoreDTO dto = null;

		try {
			sql = "{call selectHak(?,?)}";
			cstmt = conn.prepareCall(sql);
			//out�Ķ���� �ڷ��� ����
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			//in�Ķ����
			cstmt.setString(2, hak);
			//���ν��� ����
			cstmt.executeUpdate();
			//out �Ķ����  
			res = (ResultSet)cstmt.getObject(1);

			if (res.next()) {
				dto = new ScoreDTO();
				dto.setHak(res.getString("hak"));
				dto.setName(res.getString("name"));
				dto.setKor(res.getInt("kor"));
				dto.setEng(res.getInt("eng"));
				dto.setMat(res.getInt("mat"));
				dto.setTot(res.getInt("tot"));
				dto.setAve(res.getInt("ave"));
			}
			res.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return dto;
	}

}
