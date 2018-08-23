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

// 상대방 IP 주소
// PORT 번호 0~65535
// 자신의 IP wnth
// Data

// 네트워크에서는 소켓에 데이터를 담아 전달

public class Client1 extends JFrame implements Runnable, ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private Socket sc = null;
	private int port = 8282;
	private String host = "192.168.16.26";  // 127.0.0.1 루프백 주소
	
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

		setTitle("채팅 서버");
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
			OutputStream os = sc.getOutputStream(); // 내보내는 소켓
			PrintWriter pw = new PrintWriter(os, true); // PrintWriter 라는 보조 스트림
			pw.println("송재훈] " + str);

			ta.append("\r\n송재훈] " + str); // 클라이언트 화면에
			tf.setText("");
			tf.requestFocus();

		} catch (Exception e2) {
			ta.append("\r\n서버와 연결이 종료되었습니다..");
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
			ta.append("\r\n서버연결 종료..");
			sc = null;
		}
	}

	public void connect() { // 클라이언트가 접속했다는것을 알리는 메소드
		try {
			
			sc = new Socket(host, port);
			
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			System.out.println("서버가 종료됨..");
			System.out.println(e.toString());
		}

	}

	public static void main(String[] args) {
		new Client1().connect();
	}
}
