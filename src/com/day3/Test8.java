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

		//���ѷ���
		while(true){
			
			do{
				System.out.print("�� �Է� : ");
				num = Integer.parseInt(br.readLine());
			}while(num < 1 || num > 5000);
			
			for(int i = 0; i <= num ;i++){
				sum += i;
			}

			System.out.println("1 ~ " + num + "������ �� : " + sum );
			sum = 0 ; 

			System.out.println("��� �����Ͻðڽ��ϱ�? (Y/N)"); // Y, y, N, n
			ans = (char)System.in.read();
			
/*			if(ans == "Y"&& ans == "y"){
				continue;
			}else if(ans == 'N' && ans == 'n'){
				break;
			}

*/
			if(ans != 'Y' && ans != 'y'){
				break; // while�� , do~while�� , for��, switch��
			}
			System.in.skip(2);
		} // end..while
	}  //end..main
} //end..class

// (char)System.in.read(); // char�� �ϳ��� �޾ƿ���