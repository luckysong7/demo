package com.day18.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test6 extends Frame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TextField tf1, tf2, tf3;
	private Button btn1, btn2, btn3, btn4;

	public Test6() {

		setLayout(new GridLayout(4, 1));

		tf1 = new TextField();
		add(tf1);

		tf2 = new TextField();
		add(tf2);

		Panel p = new Panel();
		btn1 = new Button("+");
		btn2 = new Button("-");
		btn3 = new Button("*");
		btn4 = new Button("/");

		btn1.setSize(250, 400);
		btn2.setSize(250, 400);
		btn3.setSize(250, 400);
		btn4.setSize(250, 400);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);

		add(p);

		tf3 = new TextField();
		add(tf3);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		setTitle("°è»ê±â");
		setSize(100, 160);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Test6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob instanceof Button) {
			int num1 = Integer.parseInt(tf1.getText());
			int num2 = Integer.parseInt(tf2.getText());
			int result = 0;
			if (ob == btn1) {
				result = num1 + num2;
				tf3.setText(Integer.toString(result));
			}
			if (ob == btn2) {
				result = num1 - num2;
				tf3.setText(Integer.toString(result));
			}
			if (ob == btn3) {
				result = num1 * num2;
				tf3.setText(Integer.toString(result));
			}
			if (ob == btn4) {
				double result2 = (double) num1 / num2;
				tf3.setText(Double.toString(result2));
			}
		}
	}
}
