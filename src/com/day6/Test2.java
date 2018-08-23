package com.day6;

import java.util.Scanner;


		
		// 주민번호 검색
		/*
		 * index : 01234567890123
		 * jumin : 941231-2053128
		 * check : 234567 892345
		 */
		
		// 합 = (9*2) + (4*3) + ... + (2*5) [세로로 곱해서 모두 더한값]
		// 합 = 11 - 합%11
		// 합 = 합%10
		// 합 == 8 
		
		
//		String str = "seoul korea"; 
//		// String 은 클래스임 
//		// 하지만 문자를 담는 자료형처럼 쓰임
//		// 자리마다 고유 인덱스가 만들어짐
//		
//		System.out.println(str.substring(0, 3)); // 0 1 2 자리 글자 출력
//		Scanner sc = new Scanner(System.in);
//		
//		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
//		
//		String str;
//		int i , tot, su;
//		
//		System.out.print("주민번호[xxxxxx-xxxxxxx] ? : ");
//		str = sc.next();
//		
//		if(str.length() != 14){
//			System.out.println("입력오류 !");
//			return ; // main 메소드를 빠져나감(stop)
//		}
//		
//		tot = 0 ; 
//		for(i = 0 ; i < 12 ; i++){
//			if(i >= 6){// 뒷자리 비교
//				tot += chk[i] *
//						Integer.parseInt(str.substring(i+1, i+2));
//						
//						
//			}else{ // 앞자리 비교
//				tot += chk[i] * 
//						Integer.parseInt(str.substring(i, i+1));
//			}
//		}
//		
//		su = 11 - tot % 11;
//		su = su % 10;
//		
//		if(su == Integer.parseInt(str.substring(13))){
//			System.out.println(">> 정확한 주민등록번호 입니다");
//		}else{
//			System.out.println(">> 틀린 주민등록번호 입니다.");
//		}
	


class Test2{
	String numberJumin;
	
	int su, tot;
	
	boolean check ;
	// 주민 번호 입력 받기 메소드
	public String input_Jumin(){
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호[xxxxxx-xxxxxxx] ? : ");
		numberJumin = sc.next();
		
		if(numberJumin.length() != 14){
			System.out.println("입력오류 !");
			
			System.exit(0); // main 메소드를 빠져나감(stop)
		}
		return numberJumin;
		
	}
	
	//주민번호 체크작업 메소드
	public void check_Jumin(String a){
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		tot = 0 ; 
		for(int i = 0 ; i < 12 ; i++){
			if(i >= 6){// 뒷자리 비교
				tot += chk[i] *
						Integer.parseInt(numberJumin.substring(i+1, i+2));
						
						
			}else{ // 앞자리 비교
				tot += chk[i] * 
						Integer.parseInt(numberJumin.substring(i, i+1));
			}
		}
		
		su = 11 - tot % 11;
		su = su % 10; 
		
		if(su == Integer.parseInt(numberJumin.substring(13))){
			check = true;
		}else{
			check = false;
		}
	}
	
	//결과 출력 메소드 
	public void print_Jumin(){
		if(check == true){
			System.out.println(">> 정확한 주민등록번호 입니다");			
		}else if(check == false){
			System.out.println(">> 틀린 주민등록번호 입니다.");
		}
		
		
	}
}
