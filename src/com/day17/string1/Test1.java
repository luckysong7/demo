package com.day17.string1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

// ���� �׼���
// RandomAccessFile

//�Ϲ����� ������ ���������� data�� �о��(ī��Ʈ����)
//RandomAccessFile �� ���ϴ� ������ �̵��ؼ� �б� ���� (CD)

public class Test1 {
	public static void main(String[] args) throws IOException {
		File f = File.createTempFile("imsi", ".tmp"); // �ӽ� ���� �ϳ� ����

		f.deleteOnExit();

		FileOutputStream fos = new FileOutputStream(f);

		for (int i = 0; i <= 100; i++) {
			fos.write(i);
		}

		fos.close();
		
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		raf.seek(30); // 30��° ������ �о����
		System.out.println("seek(30) : " + raf.readByte());
		
		raf.seek(1); // 1��° ������ �о����
		System.out.println("seek(1) : " + raf.readByte());
		
		for(int i = 0 ; i < 100 ; i++){
			raf.seek(i);
			System.out.println(raf.readByte());
		}
		
		raf.close();

	}
}
