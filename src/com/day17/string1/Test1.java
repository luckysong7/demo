package com.day17.string1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

// 파일 액세스
// RandomAccessFile

//일반적인 파일은 순차적으로 data를 읽어옴(카세트테잎)
//RandomAccessFile 은 원하는 곳으로 이동해서 읽기 가능 (CD)

public class Test1 {
	public static void main(String[] args) throws IOException {
		File f = File.createTempFile("imsi", ".tmp"); // 임시 파일 하나 생성

		f.deleteOnExit();

		FileOutputStream fos = new FileOutputStream(f);

		for (int i = 0; i <= 100; i++) {
			fos.write(i);
		}

		fos.close();
		
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		raf.seek(30); // 30번째 데이터 읽어오기
		System.out.println("seek(30) : " + raf.readByte());
		
		raf.seek(1); // 1번째 데이터 읽어오기
		System.out.println("seek(1) : " + raf.readByte());
		
		for(int i = 0 ; i < 100 ; i++){
			raf.seek(i);
			System.out.println(raf.readByte());
		}
		
		raf.close();

	}
}
