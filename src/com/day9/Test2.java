package com.day9;

class Rect{

	private int w,h;	
	
	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	
	//기본 생성자
	public Rect(){
		
	}
	
	public Rect(int w, int h){
		
		this.w = w;
		this.h = h;
	}
	
	public void set(int w, int h ){
		this.w = w;
		this.h = h;
	}
	
	public int area(){
		return w*h;
	}
	
	public int length(){
		return (w+h)*2;
	}
	
	public void print_Area(int a){
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
	}
	
	public void print_Area_Length(int a , int l){
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);
	}
	
}


public class Test2 {
	public static void main(String[] args) {
		Rect obj1 = new Rect();
		
		obj1.set(10,20);
		int a = obj1.area();
		int l = obj1.length();
		obj1.print_Area_Length(a, l);
	}

}
