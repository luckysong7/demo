package com.day12;

import java.util.Scanner;

interface FruitA {

	String Won = "��";

	public int getPrice();

	public String getName();

}

interface ItemFruit extends FruitA {

	public String getItems();

}

class Orange implements ItemFruit {

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "������";
	}

	@Override
	public String getItems() {
		return "����";
	}

}

class Apple implements ItemFruit {

	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getItems() {
		return null;
	}



}

public class Test5 {

	public void packing(ItemFruit ob) {

		System.out.println("���� : " + ob.getItems());
		System.out.println("�̸� : " + ob.getName());
		System.out.println("���� : " + ob.getPrice() + FruitA.Won);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Test5 t = new Test5();

		System.out.println("1. ������ 2. ���");

		int n = sc.nextInt();

		if (n == 1) {
			t.packing(new Orange());
		} else if (n == 2) {
			t.packing(new Apple());
		}

	}
}
