package com.day6;

import java.util.Scanner;


		
		// �ֹι�ȣ �˻�
		/*
		 * index : 01234567890123
		 * jumin : 941231-2053128
		 * check : 234567 892345
		 */
		
		// �� = (9*2) + (4*3) + ... + (2*5) [���η� ���ؼ� ��� ���Ѱ�]
		// �� = 11 - ��%11
		// �� = ��%10
		// �� == 8 
		
		
//		String str = "seoul korea"; 
//		// String �� Ŭ������ 
//		// ������ ���ڸ� ��� �ڷ���ó�� ����
//		// �ڸ����� ���� �ε����� �������
//		
//		System.out.println(str.substring(0, 3)); // 0 1 2 �ڸ� ���� ���
//		Scanner sc = new Scanner(System.in);
//		
//		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
//		
//		String str;
//		int i , tot, su;
//		
//		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx] ? : ");
//		str = sc.next();
//		
//		if(str.length() != 14){
//			System.out.println("�Է¿��� !");
//			return ; // main �޼ҵ带 ��������(stop)
//		}
//		
//		tot = 0 ; 
//		for(i = 0 ; i < 12 ; i++){
//			if(i >= 6){// ���ڸ� ��
//				tot += chk[i] *
//						Integer.parseInt(str.substring(i+1, i+2));
//						
//						
//			}else{ // ���ڸ� ��
//				tot += chk[i] * 
//						Integer.parseInt(str.substring(i, i+1));
//			}
//		}
//		
//		su = 11 - tot % 11;
//		su = su % 10;
//		
//		if(su == Integer.parseInt(str.substring(13))){
//			System.out.println(">> ��Ȯ�� �ֹε�Ϲ�ȣ �Դϴ�");
//		}else{
//			System.out.println(">> Ʋ�� �ֹε�Ϲ�ȣ �Դϴ�.");
//		}
	


class Test2{
	String numberJumin;
	
	int su, tot;
	
	boolean check ;
	// �ֹ� ��ȣ �Է� �ޱ� �޼ҵ�
	public String input_Jumin(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx] ? : ");
		numberJumin = sc.next();
		
		if(numberJumin.length() != 14){
			System.out.println("�Է¿��� !");
			
			System.exit(0); // main �޼ҵ带 ��������(stop)
		}
		return numberJumin;
		
	}
	
	//�ֹι�ȣ üũ�۾� �޼ҵ�
	public void check_Jumin(String a){
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		tot = 0 ; 
		for(int i = 0 ; i < 12 ; i++){
			if(i >= 6){// ���ڸ� ��
				tot += chk[i] *
						Integer.parseInt(numberJumin.substring(i+1, i+2));
						
						
			}else{ // ���ڸ� ��
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
	
	//��� ��� �޼ҵ� 
	public void print_Jumin(){
		if(check == true){
			System.out.println(">> ��Ȯ�� �ֹε�Ϲ�ȣ �Դϴ�");			
		}else if(check == false){
			System.out.println(">> Ʋ�� �ֹε�Ϲ�ȣ �Դϴ�.");
		}
		
		
	}
}
