package com.day8;

import java.util.Scanner;



class Student{
	int num_Student = 0 ;
	String name = "";
	int score[] = new int[3]; // 국영수 점수 받을 배열
	Student_Info[] info; // 학생 클래스 정보
	String subject[] = {"국어","수학","영어"};
	
	Scanner sc = new Scanner(System.in);
	
	// 인원 수 입력 
	public void input_NumofStudent(){
		do{
			System.out.print("학생수를 입력해주세요 [1~10]: ");
			num_Student = sc.nextInt();
		}while(num_Student < 1 || num_Student >10);
		
		info = new Student_Info[num_Student]; // 학생수 만큼 Student 정보 담을 배열 생성(메모리할당)
		
	}
	
	// 학생 이름과 성적 입력 받기
	public void input_StudenInfo(){
		for(int i = 0 ; i < num_Student ; i++){
			info[i] = new Student_Info(); // 객체 생성
			System.out.print((i+1) + "번째 학생의 이름 : ");
			info[i].name = sc.next();
			for(int j = 0 ; j < 3; j++){
				System.out.print((i+1)+ "번째 학생의 "+ subject[j]+" ? ");
				info[i].score[j] = sc.nextInt();
			}
		}
	}
	
	//학생 점수 합계와 평균 계산
	private void cal_score(){
		for(int i = 0 ; i < num_Student ; i++){
			for(int j = 0 ; j < subject.length ; j++){
				info[i].sum += info[i].score[j];
			}
			info[i].avg = info[i].sum / 3;
		}
	}
	
	// 과목의 등급 계산
	private String cal_Rank(int n){
		if(n >= 90){
			return "(수)";
		}else if(n >= 80){
			return "(우)";
		}else if(n >= 70){
			return "(미)";
		}else if(n >= 60){
			return "(양)";
		}else{
			return "(가)";
		}
		
	}
	
	// 결과 출력
	public void printOut(){
		cal_score();
		for(int i = 0 ; i < num_Student ; i++){
			System.out.printf("%5s | %s과목 : %3d %3s / %s과목 : %3d %3s / %s과목 : %3d %3s  ", 
					info[i].name , subject[0], info[i].score[0], cal_Rank(info[i].score[0]),
					subject[1], info[i].score[1], cal_Rank(info[i].score[1]),
					subject[2], info[i].score[2], cal_Rank(info[i].score[2]));
			System.out.printf("합계 : %d 평균 : %d \n", info[i].sum, info[i].avg);
		}
		
	}
}

public class HW2 {
	public static void main(String[] args) {
		Student obj = new Student(); // Student 객체 생성
		
		obj.input_NumofStudent(); // 학생수 입력 받기
		obj.input_StudenInfo(); // 이름, 국어 , 수학, 영어 점수 받기
		
		obj.printOut();
		
		
	}
	
	
	
}
