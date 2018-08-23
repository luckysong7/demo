package com.day17.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
	public static void main(String[] args) throws IOException {
		// FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
		//
		// FileOutputStream fos = new FileOutputStream("d:\\doc\\out2.txt");
		//
		// int data;
		//
		// while ((data = fis.read()) != -1) {
		// System.out.write(data);
		// fos.write(data);
		// System.out.flush();
		// }
		//
		// System.out.println("복사완료");

		final String FILE1 = "d:\\doc\\test.txt";
		final String FILE2 = "d:\\doc\\out2.txt";

		FileInputStream fis = new FileInputStream(FILE1);
		FileOutputStream fos = new FileOutputStream(FILE2);

		int data;

		while ((data = fis.read()) != -1) {
			System.out.write(data);
			fos.write(data);
			fos.flush();

		}
		fis.close();
		fos.close();
		System.out.println("입력 완료 ! ");

	}
}
