package com.day5;

import com.day5.Sort;

public class SelectionSort {

	public static void main(String[] args) {
		
		Sort sort = new Sort();
		
		ArrayData arrayData = new ArrayData();
		
		System.out.println("몇개의 데이터를 입력받을것인지 입력 : ");
		
		int[] array = new int[arrayData.setLength()];
		
		System.out.println("정렬할 데이터 입력");
		
		for(int i = 0 ; i < array.length; i++){
			array[i] = arrayData.setData();
		}
		
		System.out.print("정렬 전 Array : ");
		for(int n : array){
			System.out.print(n + "  ");
		}
		System.out.println("");
		
		sort.selectionSort(array);
		
		System.out.print("정렬 후 Array : ");
//		for(int i = 0 ; i < array.length; i++){
//			System.out.print(array[i]+ "  ");
//		}
		for(int n : array){
			System.out.print(n+ "  ");
		}
		System.out.println();
		
	}

}
