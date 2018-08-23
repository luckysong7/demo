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
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;

// 상대방 IP 주소
// PORT 번호 0~65535
// 자신의 IP wnth
// Data

// 네트워크에서는 소켓에 데이터를 담아 전달

public class Server1 extends JFrame implements Runnable, ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private ServerSocket ss = null;
	private Socket sc = null;

	public Server1() {
		
		
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
			pw.println("서버 | " + str);

			ta.append("\r\n서버 | " + str); // 서버 화면에
			tf.setText("");
			tf.requestFocus();

		} catch (Exception e2) {
			ta.append("\r\n클라이언트와 연결이 종료되었습니다..");
			sc = null;
		}
	}

	@Override
	public void run() {
		String str;
		String ip;
		try {

			if (sc == null) {
				return;
			}

			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			ip = sc.getInetAddress().getHostAddress(); // IP

			ta.append("\r\n[" + ip + "]" + "접속함");

			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str);
			}

		} catch (Exception e) {
			ta.append("\r\n클라이언트 종료..");
			sc = null;
			ss = null;
		}
	}

	public void serverStart() { // 클라이언트가 접속했다는것을 알리는 메소드
		try {
			// 서버 소켓을 생성
			ss = new ServerSocket(5555); // 포트번호 설정
			ta.setText("서버 대기중 !!");
			
			// 클라이언트의 접속을 기다리다가 
			sc = ss.accept(); // 접속 명령어

			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public static void main(String[] args) {
		new Server1().serverStart(); // 메소드 하나일때 바로 사용 가능
	}
}
