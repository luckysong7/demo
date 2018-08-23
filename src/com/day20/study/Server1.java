package com.day20.study;

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
			OutputStream os = sc.getOutputStream(); 
			PrintWriter pw = new PrintWriter(os,true);
			
			pw.println("서버 | " + str);
			
			ta.append("\r\n서버 | " + str);
			tf.setText("");
			tf.requestFocus();
		} catch (Exception e2) {
			// TODO: handle exception
		}

	}

	@Override
	public void run() {
		String str;
		String ip;
		
		try {
			if(sc == null){
				return ;
			}
			
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			ip = sc.getInetAddress().getHostAddress();
			
			ta.append("\r\n[" + ip + "] 님이 접속하셨습니다.");
			
			while((str=br.readLine()) != null){
				ta.append("\r\n" + str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		ta.append("\r\n클라이어트 종료");
		sc = null;
		ss = null;

	}
	
	public void serverStart(){
		try {
			ss = new ServerSocket(8282);
			ta.setText("서버 오픈");
			
			sc = ss.accept();
			
			Thread th = new Thread(this);
			th.start();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		new Server1().serverStart();
	}

}
