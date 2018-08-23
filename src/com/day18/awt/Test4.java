package com.day18.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test4 extends Frame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Button btn;
	private TextArea ta;
	private TextField tf;

	public Test4() {
		tf = new TextField();
		ta = new TextArea();
		btn = new Button("추가");

		tf.addActionListener(this);
		btn.addActionListener(this);
		
		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setSize(300, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

	}

	public static void main(String[] args) {
		new Test4();
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		Object ob = evt.getSource();
		if (ob instanceof Button || ob instanceof TextField) {

			String str = tf.getText();
			if (!str.equals("")) {
				ta.append(str + "\n\r");
			}

			tf.setText(""); // 초기화 
			tf.requestFocus(); // 커서 이동
		}
	}

}
