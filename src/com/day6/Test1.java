package com.day6;

public class Test1 {
	public static void main(String[] args) {
		
		
		int arr[] = {30,26,35,15,40};
		
		int arr2[] = new int[100]; 
		
		System.out.println("Source Data");
		for(int v : arr){
			System.out.print(v + " ");
		}
		
		for(int i = 1 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr.length-i ;j++){
				
//				if(arr[j] > arr[j+1]){
//					int temp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j]= temp;
//				}
//				
				if(arr[j] > arr[j+1]){
					int temp = arr[j] ; 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Data : ");
		for(int v : arr){
			System.out.print(v + " ");
		}
	}
}
