package com.day17.stream;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// File 클래스
// 파일및 폴더를 관리할수 있는 기능을 제공해주는 클래스 
// 파일의 복사 또는 이름변경 등의 조작을 할경우 사용될뿐
// 파일의 내용을 입출력하기 위한 메소드는 제공하지 않음 

public class Test11 {

	public static void main(String[] args) throws IOException {

		File f = new File("d:\\doc\\test.txt");

		System.out.println("◆◆◆◆ 파 일 정 보 ◆◆◆◆");
		System.out.println("파일명 : " + f.getName());
		System.out.println("파일길이 : " + f.length());
		System.out.println("파일경로 : " + f.getAbsolutePath());
		System.out.println("표준경로 : " + f.getCanonicalPath());
		System.out.println("만들일 : " + new Date(f.lastModified()));
		System.out.println("상위폴더경로 : " + f.getParent());
		System.out.println("읽기속성 : " + f.canRead());
		System.out.println("쓰기속성 : " + f.canWrite());

		//현재 경로
		String path = System.getProperty("user.dir");
		System.out.println("현재경로 : " + path);
		
	}
}
