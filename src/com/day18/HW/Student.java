package com.day18.HW;

import java.io.FileNotFoundException;
import java.io.IOException;

interface Student {
	public int input() throws Exception; // ���� ���� �Է�

	public void print() throws IOException, ClassNotFoundException; // ����Ǿ� �ִ� ���� ���

	public void exit(); // ������� ���� ���� �� �ٽ� ����
}
