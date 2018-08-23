package com.day17.stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

// OutputStreamReader

public class Test4 {
	public static void main(String[] args) throws IOException {
		int data;
		System.out.println("문자열 입력 : ");
		Reader rd = new InputStreamReader(System.in);
		
		Writer wr = new OutputStreamWriter(System.out);
		
		while((data = rd.read()) != -1){
			wr.write(data);
			wr.flush();   // 패킷 사이즈가 꽉 채워져야 출력됨 
			// 하지만 flush를 쓰면 강제로 지금까지의 패킷사이즈만 해서 출력
			
		}
	}
}
