package com.day4;

public class HW2 {
	
	public static void main(String[] args) {
		int sum_odd = 0;
		int sum_even = 0;
		for(int i = 0 ; i <= 100 ; i++){
			if(i % 2 == 0){
				sum_even += i;
			}
			else if(i % 2 != 0){ 
				sum_odd += i;
			}
		}
		System.out.println("¦���� �� : " + sum_even);
		System.out.println("Ȧ���� �� : " + sum_odd);
		System.out.println("���� : " + (sum_even + sum_odd));
	}

}
