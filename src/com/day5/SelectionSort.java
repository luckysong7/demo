package com.day5;

import com.day5.Sort;

public class SelectionSort {

	public static void main(String[] args) {
		
		Sort sort = new Sort();
		
		ArrayData arrayData = new ArrayData();
		
		System.out.println("��� �����͸� �Է¹��������� �Է� : ");
		
		int[] array = new int[arrayData.setLength()];
		
		System.out.println("������ ������ �Է�");
		
		for(int i = 0 ; i < array.length; i++){
			array[i] = arrayData.setData();
		}
		
		System.out.print("���� �� Array : ");
		for(int n : array){
			System.out.print(n + "  ");
		}
		System.out.println("");
		
		sort.selectionSort(array);
		
		System.out.print("���� �� Array : ");
//		for(int i = 0 ; i < array.length; i++){
//			System.out.print(array[i]+ "  ");
//		}
		for(int n : array){
			System.out.print(n+ "  ");
		}
		System.out.println();
		
	}

}
