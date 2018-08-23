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
// Serializable 인터페이스의 하위 인터페이스 
// Serializble과 같은 기능을 하되 조금 더 완벽한 제어가 가능함

// writeExternal() readExternal() 메소드를 정의 

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
	// 복원호출시(역직렬화)
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		name = (String) in.readObject();
		age = in.readInt();

		System.out.println("readExternal 이 실행되었습니다.");
	}

	@Override
	// 직렬화할때 (저장)
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeInt(age);

		System.out.println("writeExternal 가 실행되었습니다.");
	}

}

public class Test3 {
	public static void main(String[] args) {
		DataTest ob = new DataTest("최유정", 25);
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
