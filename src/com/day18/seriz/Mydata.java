package com.day18.seriz;

import java.io.Serializable;

public class Mydata implements Serializable{ 

	private String name;
	private transient int score;

	public Mydata(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {

		return name + " : " + score;
	}
}
