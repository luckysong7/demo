package com.day7;

class Aclass{
	int a, b ; // instance변수 전역변수 
	
}

public class Test2 {
	public static void main(String[] args) {
		Aclass ob1 = new Aclass();
		Aclass ob2 = new Aclass();
		
		ob1.a = 10;
		ob2.b = 20;
		
	}
}
