package com.day16;

import java.util.Random;
import java.util.Scanner;

class MyThread13 extends Thread {
	


	@Override
	public void run() {
		int i = 0;
		System.out.print("����� .");
		
		while (i < 10) {
			System.out.print(".");
			try {
				sleep(300); // 0.4 ��
			} catch (Exception e) {
			}
			i++;
		}
		System.out.println();
		System.out.println("�����մϴ� ! ��÷ ������ ������ �����ϴ�.\n");

	}
}

public class Presenter2 {

	public static void main(String[] args) {

		String[] name = { "�忹��", "��ȫ��", "�ֿ���", "����", "������", "������", "�强��",
				"�ѽ´�", "������", "������", "�贩��", "������", "��뱤", "������", "������", "�̾��",
				"�����", "������", "���Ѱ�", "������", "�Ӵܺ�", "���س�", "������", "������", "�ڿ���",
				"��ο�", "������", "�ڸ�", "�㵵��", "�Ż�" };

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��ǥ�� �ο��� ?");
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
			System.out.println((k + 1) + "��° ��ǥ�� : " + name[arr[k]]);
		}

		System.out.println("\n�̻��Դϴ�.");

	}

}
