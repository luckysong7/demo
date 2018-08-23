package com.day20.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server2 {
	private ArrayList<Socket> clients = new ArrayList<Socket>();
	public final int SOCKET = 5555;

	public void serverStart() {
		try {
			ServerSocket ss = new ServerSocket(SOCKET);
			System.out.println("서버 시작 ...");

			while (true) {
				Socket sc = ss.accept();

				WorkThread wt = new WorkThread(sc);

			}

		} catch (Exception e) {
			// TODO: handle exception
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
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				
				ip = sc.getInetAddress().getHostAddress();
				
				clients.add(sc);
				
				msg = ip + " | 가 입장하셨습니다.";
				
				for(Socket s : clients){
					if(s == sc ){
						continue;
					}
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
					pw.println(msg);
					
				}
				
				while((msg = br.readLine()) != null){
					for( Socket s : clients){
						if(s == sc){
							continue;
						}
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
						pw.println(msg);
					}
					System.out.println(msg);
				}
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		Server2 ob = new Server2();
		ob.serverStart();
	}

}
