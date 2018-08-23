package com.day18.seriz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

// 객체의 직렬화 
// 메모리에 생성된 클래스객체의 멤버변수의 현재상태를 
// 그대로 보조해서 파일에 저장하거나 네트워크를 통해 전달할 수 있는 기능
// 오로지 바이트 단위로만 데이터를 송수신 할수 있다.

// 장점 : 객체자체의 내용을 입출력 형식에 구애받지 않고
// 객체를 파일에 저장함으로써 영속성을 제공할 수 있고,
// 객체 자체를 네트워크를 통해 손쉽게 교환할 수 있다. 

// implements Serializable 로 구현한다 (단 메소드는 없다)


public class Test1 {
	public static void main(String[] args) throws Exception {

		Hashtable<String, String> hMap = new Hashtable<String, String>();

		hMap.put("1", "최유정");
		hMap.put("2", "김청하");
		hMap.put("3", "주결경"); // 직렬화 되어 있음

		FileOutputStream fos = new FileOutputStream("d:\\doc\\a1.txt");

		// 직렬화작업
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(hMap);
		oos.close();
		fos.close();
		
		System.out.println("파일 내보내기 성공~");

	}
}
