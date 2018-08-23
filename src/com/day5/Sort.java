package com.day5;


public class Sort {
	
	public int[] selectionSort(int[] array){
		
		int temp = 0;
		
		int minIndex = 0 ; // 최소값의 Index 를 저장할 변수
		
		for(int i = 0 ; i < array.length-1 ; i++){
			
			minIndex = i ; 
			
			for(int j = i+1 ; j < array.length; j++){
				if(array[j] < array[minIndex]){
					System.out.println(i + " : " + j);
					minIndex = j;
				}
			}

			temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
			
		}
		
		return array;
	}
}
