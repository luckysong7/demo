package com.day18.seriz;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("d:\\doc\\a1.txt");

		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Hashtable<String, String> hMap = (Hashtable<String, String>) ois.readObject(); // Â¦À» ¸ÂÃçÁÖÀÚ
		
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()){
			String key = it.next();
			String value = hMap.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
