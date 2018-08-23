package com.day13;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test7 {
	private static final String city[] = { "서울", "부산", "대구", "인천", "수원", "광주",
			"대전", "울산" }; // 배열

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		String str ; 
		
		System.out.println("벡터의 초기용량 : " + v.capacity()); // 벡터의 기본 초기 용량은 10 
		
		for(String n : city){
			v.add(n);
		}
		System.out.println("[Iterator를 이용한 전체 출력]");
		Iterator<String> it = v.iterator();
		while(it.hasNext()){
			str = it.next();
			System.out.print(str + " " );
		}
		System.out.println();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터 개수 : " + v.size());
		v.set(0,"뉴욕"); // 쓰기 기능 (데이터 변경)
		v.set(1,"워싱턴"); // 쓰기 기능 
		
		for(String s : v){
			System.out.print(s + " " );
		}
		System.out.println();
		
		//끼워넣기 
		v.insertElementAt("대한민국", 0); // 뒤에 인덱스 번호 바뀜 
		for(String s : v){
			System.out.print(s + " " );
		}
		System.out.println();
		
		//검색 
		int index = v.indexOf("바보");
		if(index != -1){
			System.out.println("검색 성공 : " + index);
		}else{
			System.out.println("검색 실패");
		}
		
		//오름차순
		Collections.sort(v);
		for(String s : v ){
			System.out.print(s + " ");
		}
		System.out.println();
		
		//내림차순
		Collections.sort(v, Collections.reverseOrder()); // 역으로 정렬 
		for(String s : v ){
			System.out.print(s + " ");
		}
		System.out.println();
		
		//삭제 
		v.remove("워싱턴");
//		v.remove(1);
		for(String s : v ){
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터 개수 : " + v.size());
		
		//용량증가 
		for(int i = 1 ; i <= 20 ; i++){
			v.add(Integer.toString(i));
		}
		for(String s : v ){
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("벡터의 용량 : " + v.capacity()); // 벡터의 용량 
		System.out.println("데이터의 개수 : " + v.size());
		
		// 범위삭제 
		for(int i = 1 ; i <= 10 ; i++){ // 10번동안 5번째 있는 데이터 
			//5번째 데이터가 지워지면 뒤에 있던 데이터 인덱스번호가 땡껴짐
			v.remove(5); 
		}
		for(String s : v ){
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터 개수 : " + v.size());
		
		//빈공간 삭제 
		v.trimToSize();
		System.out.println();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터 개수 : " + v.size());
		
		//전체 삭제 
		v.clear();
		System.out.println();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터 개수 : " + v.size());
		
		//빈공간 삭제 
		v.trimToSize();
		System.out.println();
		System.out.println("벡터 용량 : " + v.capacity());
		System.out.println("데이터 개수 : " + v.size());
	}  
}
