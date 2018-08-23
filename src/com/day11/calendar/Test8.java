package com.day11.calendar;

abstract class SortInt {

	private int[] value;

	protected abstract void sorting(); // 추상메소드

	public void sort(int[] value) {
		this.value = value;

		sorting();

	}

	public int length() {
		if (value == null) {
			return 0;
		}

		return value.length; // 배열의 길이는 () 없다 !!
	}

	protected final int compare(int i, int j) {

		if (value[i] == value[j]) {
			return 0;
		} else if (value[i] > value[j]) {
			return 1;
		} else {
			return -1;
		}

	}

	protected final void swap(int i, int j) {
		
		int temp =0;

		temp = value[i];
		value[i] = value[j];
		value[j] = temp;

	}

	public void print() {

		if (value == null) {
			return; // 아래쪽에 있는 명령어들 stop
		}
		for (int n : value) {
			System.out.printf("%4d", n);
		}

	}

}

class SortTest extends SortInt {

	@Override
	protected void sorting() {

		// Selection Sort
		for (int i = 0; i < length()-1; i++) {
			for (int j = i + 1; j < length(); j++) {
				if (compare(i, j) > 0) {
					swap(i, j);
				}
			}
		}
	}
	
}

public class Test8 {
	public static void main(String[] args) {
		SortTest ob = new SortTest();
		int[] value = {4,21,42,10,16,33};
	
		ob.sort(value);
		ob.print();
	}
}
