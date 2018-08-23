package com.day17.stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test10 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos;
			PrintStream ps;

			fos = new FileOutputStream("d:\\doc\\out5.txt");
			ps = new PrintStream(fos);

			ps.println("2018-06-11");
			ps.println("13:45:00");
			ps.println("월요일");

			ps.close();
			fos.close();

//			fos = new FileOutputStream("d:\\doc\\out5.txt"); // 다시 새로운 객체가 만들어짐 결국 덮어쓰기 결과 
			fos = new FileOutputStream("d:\\doc\\out5.txt",true); // true 를 붙이면 apppend 결과
			ps = new PrintStream(fos);
			
			ps.println("1992-11-24");
			ps.println("16:45:20");
			ps.println("목요일");
			
			ps.close();
			fos.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
