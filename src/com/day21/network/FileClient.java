package com.day21.network;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
	public static void main(String[] args) {
		int port = 5555;

		String host = "192.168.16.27"; // 127.0.0.1

		Socket sc = null;

		ObjectOutputStream oos = null;

		Scanner scn = new Scanner(System.in);

		String path;

		try {

			// d:\\doc\\a.txt
			System.out.println("������ ���� ��θ�");
			path = scn.next();

			File f = new File(path);

			if (!f.exists()) {
				System.out.println("������ �������� �ʽ��ϴ�.");
				System.exit(0);

			}

			sc = new Socket(host, port);

			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();

			// �������� ����
			FileInfo info;
			
			info = new FileInfo();
			info.setCode(100);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() + "���� ���۽���...");
			
			Thread.sleep(30); // ��Ʈ�� �ȿ����� �� �ؼ�
			
			// ���� ���� ����
			FileInputStream fis = new FileInputStream(f);
			int byteRead = 0 ; 
			byte[] buffer = new byte[1024] ; 
			
			while((byteRead = fis.read(buffer,0,1024)) != -1){
				info = new FileInfo();
				
				info.setCode(110);
				info.setSize(byteRead);
				info.setData(buffer);
				
				oos.writeObject(info);
				System.out.println(byteRead + "bytes ������ ...");
				
				buffer = new byte[1024];
				
				Thread.sleep(300); // ������ 
			}
			
			fis.close();
			
			//���� ��������
			info = new FileInfo();
			info.setCode(200);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() + "���� ��������..");
			
			oos.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
