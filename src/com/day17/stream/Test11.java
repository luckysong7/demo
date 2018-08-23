package com.day17.stream;

import java.io.File;
import java.io.IOException;
import java.util.Date;

// File Ŭ����
// ���Ϲ� ������ �����Ҽ� �ִ� ����� �������ִ� Ŭ���� 
// ������ ���� �Ǵ� �̸����� ���� ������ �Ұ�� ���ɻ�
// ������ ������ ������ϱ� ���� �޼ҵ�� �������� ���� 

public class Test11 {

	public static void main(String[] args) throws IOException {

		File f = new File("d:\\doc\\test.txt");

		System.out.println("�ߡߡߡ� �� �� �� �� �ߡߡߡ�");
		System.out.println("���ϸ� : " + f.getName());
		System.out.println("���ϱ��� : " + f.length());
		System.out.println("���ϰ�� : " + f.getAbsolutePath());
		System.out.println("ǥ�ذ�� : " + f.getCanonicalPath());
		System.out.println("������ : " + new Date(f.lastModified()));
		System.out.println("����������� : " + f.getParent());
		System.out.println("�б�Ӽ� : " + f.canRead());
		System.out.println("����Ӽ� : " + f.canWrite());

		//���� ���
		String path = System.getProperty("user.dir");
		System.out.println("������ : " + path);
		
	}
}
