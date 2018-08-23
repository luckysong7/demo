package com.day20.network;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;

// ���� IP �ּ�
// PORT ��ȣ 0~65535
// �ڽ��� IP wnth
// Data

// ��Ʈ��ũ������ ���Ͽ� �����͸� ��� ����

public class Client1 extends JFrame implements Runnable, ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private Socket sc = null;
	private int port = 8282;
	private String host = "192.168.16.26";  // 127.0.0.1 ������ �ּ�
	
	public Client1() {
		
		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);

		tf.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("ä�� ����");
		setSize(300, 400);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf.getText();

		if (str.trim().equals("")) {
			return;
		}

		if (sc == null) {
			return;
		}

		try {
			OutputStream os = sc.getOutputStream(); // �������� ����
			PrintWriter pw = new PrintWriter(os, true); // PrintWriter ��� ���� ��Ʈ��
			pw.println("������] " + str);

			ta.append("\r\n������] " + str); // Ŭ���̾�Ʈ ȭ�鿡
			tf.setText("");
			tf.requestFocus();

		} catch (Exception e2) {
			ta.append("\r\n������ ������ ����Ǿ����ϴ�..");
			sc = null;
		}
	}

	@Override
	public void run() {
		String str;
		try {

			if (sc == null) {
				return;
			}

			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str);
			}

		} catch (Exception e) {
			ta.append("\r\n�������� ����..");
			sc = null;
		}
	}

	public void connect() { // Ŭ���̾�Ʈ�� �����ߴٴ°��� �˸��� �޼ҵ�
		try {
			
			sc = new Socket(host, port);
			
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			System.out.println("������ �����..");
			System.out.println(e.toString());
		}

	}

	public static void main(String[] args) {
		new Client1().connect();
	}
}
