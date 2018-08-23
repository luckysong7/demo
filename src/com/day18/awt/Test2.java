package com.day18.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;




public class Test2 extends Frame implements WindowListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Test2() {
	
		setTitle("Java Window");
		setSize(400, 500);
		addWindowListener(this);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		Test2 ob = new Test2();
		
	}


	@Override
	public void windowActivated(WindowEvent arg0) {
		
	}


	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}


	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}


	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
	}


	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
	}


	@Override
	public void windowIconified(WindowEvent arg0) {
		
	}


	@Override
	
	public void windowOpened(WindowEvent arg0) {
	}
	
	
}
