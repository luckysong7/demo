package com.day18.seriz;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

// Externalizable
// Serializable �������̽��� ���� �������̽� 
// Serializble�� ���� ����� �ϵ� ���� �� �Ϻ��� ��� ������

// writeExternal() readExternal() �޼ҵ带 ���� 

class DataTest implements Externalizable {

	String name;
	int age;

	public DataTest() {
		// TODO Auto-generated constructor stub
	}

	public DataTest(String n, int a) {
		this.name = n;
		this.age = a;
	}

	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	// ����ȣ���(������ȭ)
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		name = (String) in.readObject();
		age = in.readInt();

		System.out.println("readExternal �� ����Ǿ����ϴ�.");
	}

	@Override
	// ����ȭ�Ҷ� (����)
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeInt(age);

		System.out.println("writeExternal �� ����Ǿ����ϴ�.");
	}

}

public class Test3 {
	public static void main(String[] args) {
		DataTest ob = new DataTest("������", 25);
		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\a3.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ob);
			oos.close();
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream("d:\\doc\\a3.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			DataTest dt = (DataTest) ois.readObject();
			System.out.println(dt.toString());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
