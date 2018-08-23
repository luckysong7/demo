package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Test8 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		


		int num = 0 ;
		int sum = 0 ;
		char ans ;

		//무한루프
		while(true){
			
			do{
				System.out.print("수 입력 : ");
				num = Integer.parseInt(br.readLine());
			}while(num < 1 || num > 5000);
			
			for(int i = 0; i <= num ;i++){
				sum += i;
			}

			System.out.println("1 ~ " + num + "까지의 합 : " + sum );
			sum = 0 ; 

			System.out.println("계속 진행하시겠습니까? (Y/N)"); // Y, y, N, n
			ans = (char)System.in.read();
			
/*			if(ans == "Y"&& ans == "y"){
				continue;
			}else if(ans == 'N' && ans == 'n'){
				break;
			}

*/
			if(ans != 'Y' && ans != 'y'){
				break; // while문 , do~while문 , for문, switch문
			}
			System.in.skip(2);
		} // end..while
	}  //end..main
} //end..class

// (char)System.in.read(); // char형 하나만 받아오기