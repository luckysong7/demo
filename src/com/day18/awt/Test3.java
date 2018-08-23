package com.day18.awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3 extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Test3() {
		setTitle("윈도우");
		setSize(200, 300);
		setVisible(true);
		addWindowListener(new MyWindowAdapter());
	}

	// 내부클래스 Nested 클래스
	class MyWindowAdapter extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new Test3();
	}
}
