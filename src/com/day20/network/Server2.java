package com.day20.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server2 {
	private ArrayList<Socket> clients = new ArrayList<Socket>();

	public void serverStart() {

		try {
			ServerSocket ss = new ServerSocket(5555);
			System.out.println("서버시작...");

			while (true) {
				Socket sc = ss.accept();

				WorkThread wt = new WorkThread(sc);
				wt.start();
			}
		} catch (Exception e) {

			System.out.println(e.toString());
		}

	}

	class WorkThread extends Thread {
		private Socket sc;

		public WorkThread(Socket sc) {
			this.sc = sc;
		}

		@Override
		public void run() {
			String ip = null;
			String msg = null;

			try {

				BufferedReader br = new BufferedReader(new InputStreamReader(
						sc.getInputStream()));

				ip = sc.getInetAddress().getHostAddress();
				// 접속한 클러이언트
				clients.add(sc);

				// 다른 클라이언트에게 접속사실을 알림

				msg = ip + " | 가 입장하셨습니다.";

				for (Socket s : clients) {
					if (s == sc) {
						continue; // 이번 과정은 패스
					}
					PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
					pw.println(msg);
				}

				System.out.println(msg);

				// 본문

				while ((msg = br.readLine()) != null) {
					for (Socket s : clients) {
						if (s == sc) {
							continue; // 이번 과정은 패스
						}
						PrintWriter pw = new PrintWriter(s.getOutputStream(),
								true);
						pw.println(msg);
					}

					System.out.println(msg);
				}

			} catch (Exception e) {
				msg = ip + " | 퇴장하셨습니다.";
				try {
					for (Socket s : clients) {
						if (s == sc) {
							continue; // 이번 과정은 패스
						}
						PrintWriter pw = new PrintWriter(s.getOutputStream(),
								true);
						pw.println(msg);
					}

					System.out.println(msg);
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}

	public static void main(String[] args) {
		Server2 ob = new Server2();
		ob.serverStart();
	}

}
