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

			Mydata ob1 = new Mydata("최유정", 100);
			Mydata ob2 = new Mydata("주결경", 90);
			Mydata ob3 = new Mydata("김세정", 80);

			oos.writeObject(ob1);
			oos.writeObject(ob2);
			oos.writeObject(ob3);
			oos.writeObject(new Mydata("김청하", 85));

			oos.close();
			fos.close();

			System.out.println("저장완료");
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// 역직렬화
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
