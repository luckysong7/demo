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
		System.out.println("Â¦¼öÀÇ ÇÕ : " + sum_even);
		System.out.println("È¦¼öÀÇ ÇÕ : " + sum_odd);
		System.out.println("ÃÑÇÕ : " + (sum_even + sum_odd));
	}

}
