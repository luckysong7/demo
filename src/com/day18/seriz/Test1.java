package com.day18.seriz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

// ��ü�� ����ȭ 
// �޸𸮿� ������ Ŭ������ü�� ��������� ������¸� 
// �״�� �����ؼ� ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� ������ �� �ִ� ���
// ������ ����Ʈ �����θ� �����͸� �ۼ��� �Ҽ� �ִ�.

// ���� : ��ü��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
// ��ü�� ���Ͽ� ���������ν� ���Ӽ��� ������ �� �ְ�,
// ��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ִ�. 

// implements Serializable �� �����Ѵ� (�� �޼ҵ�� ����)


public class Test1 {
	public static void main(String[] args) throws Exception {

		Hashtable<String, String> hMap = new Hashtable<String, String>();

		hMap.put("1", "������");
		hMap.put("2", "��û��");
		hMap.put("3", "�ְ��"); // ����ȭ �Ǿ� ����

		FileOutputStream fos = new FileOutputStream("d:\\doc\\a1.txt");

		// ����ȭ�۾�
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(hMap);
		oos.close();
		fos.close();
		
		System.out.println("���� �������� ����~");

	}
}
