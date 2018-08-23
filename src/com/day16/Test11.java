package com.day16;

public class Test11 {
	public static void main(String[] args) {
		System.out.println("Main Thread Group : "
				+ Thread.currentThread().getThreadGroup());
		
		System.out.println("Main Thread Name : " + Thread.currentThread());
		
		Thread t1 = new Thread();
		
		System.out.println("t1 스레드 그룹 : " + Thread.currentThread().getThreadGroup());
		System.out.println("t1 : " + t1); // 쓰레드 이름 / 우선순위 / 그룹명
		
		// 일반적으로 쓰레드는 메인 그룹에 속함
		
		ThreadGroup tg = new ThreadGroup("suzi"); // 그룹이름
		
		Thread t2 = new Thread(tg,"t2");
		Thread t3 = new Thread(tg,"t3");
		
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
		
	}
}
