package com.day18.awt;

import java.awt.Color;
import java.awt.Frame;

// AWT(Abstract Window Toolkit)
// Swing

public class Test1 extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // ������ �޸� ���� �䱸

	public Test1() {
		this.setTitle("�ڹ�������");
		setSize(200, 300);
		
		setBackground(new Color(255, 255, 0));
		setVisible(true);
		
		
	}

	
	
	public static void main(String[] args) {
		new Test1();
	}
}
