package com.day20.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Test1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0 ;
		try {
			String host;
			System.out.println("ȣ��Ʈ : ? ");
			host = br.readLine();
			InetAddress[] ia = InetAddress.getAllByName(host);
			while(i < ia.length){
				System.out.println("ip �ּ� : " + ia[i].getHostAddress());
				System.out.println("ȣ��Ʈ : " + ia[i].getHostName());
				i++;
			}
			

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
