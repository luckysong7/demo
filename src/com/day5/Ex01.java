package com.day5;

public class Ex01 {
	public static void main(String[] args){
		int indexMin , temp;
		
		int[] arr = {70,50,80,60,90};
	 
		for(int i =  0 ; i < arr.length-1 ; i++){
			indexMin = i;
			for(int j = i+1; j < arr.length ; j++){
				if(arr[indexMin] > arr[j]){
					indexMin = j;
				}	
			}
			temp = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = temp;
			
			
		}
		for(int k = 0; k < arr.length ; k++){
			System.out.print(arr[k] + "  ");
		}
		
	}
}
