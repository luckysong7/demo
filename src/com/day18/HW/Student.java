package com.day18.HW;

import java.io.FileNotFoundException;
import java.io.IOException;

interface Student {
	public int input() throws Exception; // 새로 정보 입력

	public void print() throws IOException, ClassNotFoundException; // 저장되어 있는 정보 출력

	public void exit(); // 현재까지 정보 저장 및 다시 실행
}
