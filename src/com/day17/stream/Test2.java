package com.day17.stream;

import java.io.IOException;
import java.io.OutputStream;

// 2. 기본 입출력 스트림
// System.out

public class Test2 {
	public static void main(String[] args) throws IOException {
		// 출력용 파이프 (기본 외부 출력용 스트림)
		OutputStream os = System.out;
		byte[] b = new byte[3];
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		System.out.println(b[0]); //아스키값
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		os.write(b); // 스트림에 기록 //문자형으로 바꿔서 출력 // 사용자입장에서 변환해서 출력
		System.out.println("나 보이지 ?");
		os.close(); // 강제로 출력 스트림을 닫음 
		System.out.println("나 보이냐 ?"); //이부분은 출력안됌

	}
}
