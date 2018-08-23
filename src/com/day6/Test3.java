package com.day6;

public class Test3 {
	public static void main(String[] args) {

		int[][] arr = new int[6][6];

		int i, j;
		int n = 0;

		for (i = 0; i < 5; i++) {
			
			if (i % 2 == 0) {
			
				for (j = 0; j < 5; j++) {
					n++;
					arr[i][j] = n;
					arr[i][5] += n;
					arr[5][j] += n;
					arr[5][5] += n;
					

				}
			} else if (i % 2 == 1) {
			
				for (j = 4; j >= 0; j--) {
					n++;
					arr[i][j] = n; 
					arr[i][5] += n;
					arr[5][j] += n;
					arr[5][5] += n;
				}
			}

		}
		
	

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);

			}
			System.out.println();
		}

	}
}

// arr[i][j] = n;
// arr[i][5] += n;
// arr[5][j] += n;
// arr[5][5] += n;