package com.day18.seriz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDataMain {
	public static void main(String[] args) throws Exception {

		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\a2.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Mydata ob1 = new Mydata("������", 100);
			Mydata ob2 = new Mydata("�ְ��", 90);
			Mydata ob3 = new Mydata("�輼��", 80);

			oos.writeObject(ob1);
			oos.writeObject(ob2);
			oos.writeObject(ob3);
			oos.writeObject(new Mydata("��û��", 85));

			oos.close();
			fos.close();

			System.out.println("����Ϸ�");
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// ������ȭ
			FileInputStream fis = new FileInputStream("d:\\doc\\a2.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);

			Mydata ob;

			while (true) {
				ob = (Mydata) ois.readObject();
				if (ob == null) {
					break;
				}

				System.out.println(ob.toString());
			}

			ois.close();
			fis.close();

		} catch (Exception e) {
			
		}

	}
}
