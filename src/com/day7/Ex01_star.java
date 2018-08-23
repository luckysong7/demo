package com.day7;

public class Ex01_star {
	
	public static void main(String[] args) {
	
		int size = 11;
		
		int m = 0 ; 
	
		
/*
* 다이아몬드 1
*/
//		for(int i = 0 ; i <= size ; i++){
//			if(i <= (size+1)/2) {
//				m = i;
//				
//			}else{
//				m = (size + 1) - i;
//			}
//			
//			for(int k = 1 ; k <= (size+1)-m ; ++k){
//				System.out.print(" ");
//			}
//			for(int j = 1 ; j <= m*2 -1 ; ++j){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
/*
* 다이아몬드 2
*/
		
//		for(int i = 1 ; i < size * 2 ; i++){
//			for(int j = 1 ; j < size * 2 ; j++){
//				if(i <= size ){
//					if(size-i < j && j < size+i){
//						System.out.print("*");
//					}else{
//						System.out.print(" ");
//					}
//				}else{
//					if(i-size < j && j < 3*size -i){
//						System.out.print("*");
//					}else{
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
//		
		
		
/*
* 다이아몬드 3 
*/
//		for(int i = 0 ; i < size ; i++){
//			for(int j = size ; j > i ; j--){
//				System.out.print(" ");
//			}
//			for(int k = 1 ; k < (i*2) ; k++ ){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 0 ; i < size ; i++ ){
//			for(int k = 0 ; k < i+2 ; k++){
//				System.out.print(" ");
//			}
//			for(int j = size ; j > (i*2) ; j--){
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
//알파벳 트리
		
//		char alpha = 'A';
//		
//		for(int i = 0, count = 1; i < size; i++, count += 2){
//			for(int j = size-i ; j > 1 ; j-- ){
//				System.out.print(" "); // 공백 출력
//			}
//			for(int j =0 ; j < count ; j++){
//				if(alpha >'Z'){
//					alpha = 'A';
//				}
//				System.out.printf("%c",alpha ++);
//			}
//			System.out.println();
//		}
		
		
		// 위에 삼각형 3개 출력
		for(int i = 0, count = 1; i < size; i++, count += 2){
			for(int j = size-i ; j > 1 ; j-- ){
				System.out.print(" "); // 공백 출력
			}
			for(int j =0 ; j < count ; j++){
				System.out.printf("%c",'*');
			}
			for(int j =(size-i)*2 ; j > 1 ; j--){
				System.out.print(" ");
			}
			for(int j = 0 ; j < count ; j++){
				System.out.printf("%c",'*');
			}
			for(int j =(size-i)*2 ; j > 1 ; j--){
				System.out.print(" ");
			}
			for(int j = 0 ; j < count ; j++){
				System.out.printf("%c",'*');
			}
			System.out.println();
		}
		
//		// 아래 삼각형 두개 출력
//		for(int i = 1 , count = (2*size)+1; i < size ; i++, count -= 2){
//			for(int j = i ; j < size-i ;  ){
//				System.out.println(" "); // 공백 출력
//			}
//		}
		
		// 아래 큰 삼각형 1개 출력
		for( int i = 0 , count = size*6-3 ; i < size*3 ; i++, count-=2){
			for(int j = (i+1) ; j > 0 ; j--){
				System.out.print(" ");
			}
			for(int j = 0 ; j < count ; j++){
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
