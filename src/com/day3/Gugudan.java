package com.day3;

public class Gugudan {
	public static void main(String[] args) {
		int dan;

		for (int i = 0; i < 2; i++) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 2; k < 6; k++) {
					dan = k + i * 4;
					System.out.print(dan + " x " + j + " = " + (dan*j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
			
		}
	}
}
