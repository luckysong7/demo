package com.day16;

import java.util.Random;
import java.util.Scanner;

class MyThread13 extends Thread {
	


	@Override
	public void run() {
		int i = 0;
		System.out.print("고민중 .");
		
		while (i < 10) {
			System.out.print(".");
			try {
				sleep(300); // 0.4 초
			} catch (Exception e) {
			}
			i++;
		}
		System.out.println();
		System.out.println("축하합니다 ! 당첨 내역은 다음과 같습니다.\n");

	}
}

public class Presenter2 {

	public static void main(String[] args) {

		String[] name = { "장예진", "노홍현", "최원경", "라영준", "송재훈", "정재훈", "장성진",
				"한승덕", "류정아", "이현진", "김누리", "조일준", "김용광", "박종훈", "서영진", "이양규",
				"김희민", "박현재", "김한결", "여정민", "임단비", "김해나", "문승준", "조기현", "박원빈",
				"김민영", "이태현", "박명성", "허도휘", "신상엽" };

		Scanner sc = new Scanner(System.in);
		System.out.print("뽑을 발표자 인원수 ?");
		int num = sc.nextInt();

		Random rd = new Random();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			int n = rd.nextInt(30);
			arr[i] = n;
			for (int j = 0; j < i; j++) {
				if (arr[j] == n) {
					i--;
					break;
				}
			}
		}

		MyThread13 ob = new MyThread13();
		ob.start();

		try {
			ob.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		for(int a = 0 ; a < num ; a++){
			System.out.print(arr[a] + " ");
		}
		System.out.println();
		for (int k = 0; k < num; k++) {
			System.out.println((k + 1) + "번째 발표자 : " + name[arr[k]]);
		}

		System.out.println("\n이상입니다.");

	}

}
