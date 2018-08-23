package com.day17.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test8 {

	// 파일의 부수적인 정보를
	public boolean fileCopy(String str1, String str2) {

		File f = new File(str1);
		if (!f.exists()) { // 파일이 없으면
			return false;
		}

		// 이부분 부터 정상적으로 실행 되었을때

		try {
			FileInputStream fis = new FileInputStream(f);
			// FileInputStream fis = new FileInputStream(str1); // 둘다 가능

			FileOutputStream fos = new FileOutputStream(str2);
			int data;
			byte[] buffer = new byte[1024];

			while ((data = fis.read(buffer, 0, 1024)) != -1) { // 0 ~ 1024 까지
																// 한번에 읽어오기
				fos.write(buffer, 0, data);
			}

			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return true;

	}

	public static void main(String[] args) {
		Test8 ob = new Test8();
		
		if(ob.fileCopy("d:\\doc\\test.txt", "d:\\doc\\out3.txt")){
			System.out.println("파일 복사 성공 !");
		}else {
			System.out.println("파일 복사 실패 !");
		}
	}
}
