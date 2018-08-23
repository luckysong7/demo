package com.day8;

import java.util.Scanner;

class Anagram {
	Scanner sc = new Scanner(System.in);

	private String word1;
	private String word2;

	// 문자 두개 입력받기
	public void input_word(){
		
		System.out.println("첫번째 문자를 입력해주세요 ");
		word1 = sc.next();
		
		System.out.println("두번째 문자를 입력해주세요 ");
		word2 = sc.next();
		
	}
	
	// 문자열 공백제거후 알파벳 정렬하고 문자열비교
//	public boolean isAnagram(String a1, String a2){
//		
//	}
}

public class AnagramMain {

}


// 클래스 