package com.score3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ScoreVO { // Value Object
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getHak() {
		return hak;
	}

	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}

	public ScoreVO(String hak, String name, int kor, int eng, int mat) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public void set(String hak, String name, int kor, int eng, int mat) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}


	@Override
	public String toString() { // toString()

		if (hak == null || name == null) {
			return null;
		}
		String str = String.format("%5s %6s %4d %4d %4d %4d %4.1f", hak, name,
				kor, eng, mat, (kor + eng + mat), (kor + eng + mat) / 3.0);

		return str;
	}

	

}
