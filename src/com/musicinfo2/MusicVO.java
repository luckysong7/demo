package com.musicinfo2;

public class MusicVO {
	String name_music; // ���� ����
	String name_musician; // ���� �̸�
	int lengthofMusic; // ���� ����
	int rating; // ���� ����

	public String getName_music() {
		return name_music;
	}

	public void setName_music(String name_music) {
		this.name_music = name_music;
	}

	public String getName_musician() {
		return name_musician;
	}

	public void setName_musician(String name_musician) {
		this.name_musician = name_musician;
	}

	public int getLengthofMusic() {
		return lengthofMusic;
	}

	public void setLengthofMusic(int lengthofMusic) {
		this.lengthofMusic = lengthofMusic;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
