package com.day3;

class Test6 {
	public static void main(String[] args) {

		// ���� ���� (3��)
		// 3���� ���
		// 2 3 4 5
		// 6 7 8 9

		int i, j, k;

		// System.out.println("2�� \t\t\t3�� \t\t\t4�� \t\t\t5�� \t\t\t ");
		// for (i = 1; i <= 9; i++) {
		// for (j = 2; j <= 5; j++) {
		// System.out.print(j + " X " + i + " = " + i * j);
		// System.out.print("\t\t");
		// }
		// System.out.println();
		// }
		// System.out.println("6�� \t\t\t7�� \t\t\t8�� \t\t\t9�� \t\t\t ");
		// for (i = 1; i <= 9; i++) {
		// for (j = 6; j <= 9; j++) {
		// System.out.print(j + " X " + i + " = " + i * j);
		// System.out.print("\t\t");
		// }
		// System.out.println();
		// }

		for (i = 2; i <= 9; i += 4) {
			for (int d = i; d < i + 4; d++) {
				System.out.printf("%d�� \t\t\t", d);
			}
			System.out.println();
			
			for (j = 1; j <= 9; j++) {
				for (k = i; k <= i + 3; k++) {

					System.out.print(k + " X " + j + " = " + k * j);
					System.out.print("\t\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

