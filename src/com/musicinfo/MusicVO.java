package com.musicinfo;

public class MusicVO {
	String name_music; // 음악 제목
	String name_musician; // 가수 이름
	int lengthofMusic; // 음악 길이
	int rating; // 음악 평점

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

	public String print_star(int r) {
		String result = "";
		switch (r) {
		case 5:
			// System.out.println("★★★★★");
			result = "★★★★★";
			break;
		case 4:
			// System.out.println("★★★★");
			result = "★★★★";
			break;
		case 3:
			// System.out.println("★★★");
			result = "★★★";
			break;
		case 2:
			// System.out.println("★★");
			result = "★★";
			break;
		case 1:
			// System.out.println("★");
			result = "★";
			break;
		}
		return result;
	}

	@Override
	public String toString() {
		String str = String.format("%10s (%s) %d초 평점: %d (%s)", name_music,name_musician,lengthofMusic,rating,print_star(rating));
		
		return str;
	}
}
