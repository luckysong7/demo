package com.customer;

import com.score1.Record;

public class customerMain {
	public static void main(String[] args) {
		Money money = new Money();
		
		// 인원수 입력받기
		money.set();
		
		// 고객명, 구매금액, 포인트금액 입력 
		money.input();
		
		// 순위 계산 후 결과 출력
		money.printout();
	}
}
