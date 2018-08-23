package com.day18.HW;

import java.io.Serializable;

public class StudentVO implements Serializable {

	private String name;
	private String birth;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		 String str = String.format("%4s %10s %3d", name, birth, score);
		 return str;

//		return name + birth + score;
	}
}
