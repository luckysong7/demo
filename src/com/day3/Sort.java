package com.day3;

import java.util.Collections;
import java.util.List;

public class Sort {
	public static int[] BubbleSortAsc(int [] items){
		for(int i = 0; i< items.length-1;i++){
			for(int j = 0 ; j < items.length-1;j++){
				if(items[j] > items[j+1]){
					int temp = items[j+1];
					items[j+1] = items[j];
					items[j] = temp;
				}
			}
		}
		return items;
	}

	public static List<Integer> BubbleSortAsc(List<Integer> items){
		Collections.sort(items);
		return items;
	}

	public static int[] BubbleSortDes(int [] items){
		for(int i = 0 ; i < items.length-1;i++){
			for(int j = 0 ; j < items.length-1;j++){
				if(items[j] < items[j+1]){
					int temp = items[j];
					items[j] = items[j+1];
					items[j+1] = temp;
				}
			}
		}
		return items;
	}

	public static List<Integer> BubbleSortDesc(List<Integer> items){
		Collections.reverse(items);
		return items;
	}

}
