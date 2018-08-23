package com.day8;

import java.util.Scanner;



class Student{
	int num_Student = 0 ;
	String name = "";
	int score[] = new int[3]; // ������ ���� ���� �迭
	Student_Info[] info; // �л� Ŭ���� ����
	String subject[] = {"����","����","����"};
	
	Scanner sc = new Scanner(System.in);
	
	// �ο� �� �Է� 
	public void input_NumofStudent(){
		do{
			System.out.print("�л����� �Է����ּ��� [1~10]: ");
			num_Student = sc.nextInt();
		}while(num_Student < 1 || num_Student >10);
		
		info = new Student_Info[num_Student]; // �л��� ��ŭ Student ���� ���� �迭 ����(�޸��Ҵ�)
		
	}
	
	// �л� �̸��� ���� �Է� �ޱ�
	public void input_StudenInfo(){
		for(int i = 0 ; i < num_Student ; i++){
			info[i] = new Student_Info(); // ��ü ����
			System.out.print((i+1) + "��° �л��� �̸� : ");
			info[i].name = sc.next();
			for(int j = 0 ; j < 3; j++){
				System.out.print((i+1)+ "��° �л��� "+ subject[j]+" ? ");
				info[i].score[j] = sc.nextInt();
			}
		}
	}
	
	//�л� ���� �հ�� ��� ���
	private void cal_score(){
		for(int i = 0 ; i < num_Student ; i++){
			for(int j = 0 ; j < subject.length ; j++){
				info[i].sum += info[i].score[j];
			}
			info[i].avg = info[i].sum / 3;
		}
	}
	
	// ������ ��� ���
	private String cal_Rank(int n){
		if(n >= 90){
			return "(��)";
		}else if(n >= 80){
			return "(��)";
		}else if(n >= 70){
			return "(��)";
		}else if(n >= 60){
			return "(��)";
		}else{
			return "(��)";
		}
		
	}
	
	// ��� ���
	public void printOut(){
		cal_score();
		for(int i = 0 ; i < num_Student ; i++){
			System.out.printf("%5s | %s���� : %3d %3s / %s���� : %3d %3s / %s���� : %3d %3s  ", 
					info[i].name , subject[0], info[i].score[0], cal_Rank(info[i].score[0]),
					subject[1], info[i].score[1], cal_Rank(info[i].score[1]),
					subject[2], info[i].score[2], cal_Rank(info[i].score[2]));
			System.out.printf("�հ� : %d ��� : %d \n", info[i].sum, info[i].avg);
		}
		
	}
}

public class HW2 {
	public static void main(String[] args) {
		Student obj = new Student(); // Student ��ü ����
		
		obj.input_NumofStudent(); // �л��� �Է� �ޱ�
		obj.input_StudenInfo(); // �̸�, ���� , ����, ���� ���� �ޱ�
		
		obj.printOut();
		
		
	}
	
	
	
}
