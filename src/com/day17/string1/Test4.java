package com.day17.string1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//FileReader
//���Ͽ��� ����Ʈ�� �о�鿩 
//����, ����Ʈ ��Ʈ������ ��ȯ

public class Test4 {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("d:\\doc\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		try {
			String str;
			while((str=br.readLine()) != null){
				System.out.println(str);
			}
			fr.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
