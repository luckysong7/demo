package com.topCoding;

import java.util.Vector;

class KiwiJuiceEasy {

	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId,
			int[] toId) {

		for (int i = 0; i < fromId.length; i++) {
			while (bottles[toId[i]] >= capacities[toId[i]]) {
				bottles[toId[i]] = bottles[toId[i]]+1;
				bottles[fromId[i]] = bottles[fromId[i]]-1;
				if (bottles[fromId[i]] == 0) {
					break;
				}
			}

			// 방법 1
			// ---------------------------------------------------------------
			// int f = fromId[i]; // 어디서
			// int t = toId[i]; // 어디로
			// int space = capacities[t] - bottles[t]; // 이동 가능한 용량
			//
			// if(space >= bottles[f]){
			// int vol = bottles[f];
			// bottles[t] += vol;
			// bottles[f] = 0;
			// }else{
			// int vol = space;
			// bottles[t] += vol;
			// bottles[f] -= vol;
			// }
			//
			// }
			// ------------------------------------------------------------------------

		}
		return bottles;
	}
}

public class test1 {

	public static void main(String[] args) {
		int[] capacities = { 20, 20 };
		int[] bottles = { 5, 8 };
		int[] fromId = { 0 };
		int[] toId = { 1 };

		KiwiJuiceEasy obj = new KiwiJuiceEasy();
		int[] result = obj.thePouring(capacities, bottles, fromId, toId);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
