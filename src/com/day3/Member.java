package com.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Member {

	private List<MemberVO> lists = null; // 회원정보 담을 리스트
	private String path = System.getProperty("user.dir");
	private File f = new File(path, "\\data\\memberInfoList.txt"); // 회원정보 담을 파일
																	// 위치

	MemberAuthen auth = new MemberAuthen(); // 예외처리 클래스
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String id;

	@SuppressWarnings("unchecked")
	public Member() {

		try {

			if (!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}

			if (f.exists()) {

				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);

				lists = (ArrayList<MemberVO>) ois.readObject();

				fis.close();
				ois.close();
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public boolean findId(String id) {

		if (lists == null) {
			return false;
		}
		Iterator<MemberVO> it = lists.iterator();

		while (it.hasNext()) {
			MemberVO vo = it.next();
			if (id.equals(vo.getId())) {
				return true;
			}
		}
		return false;

	}



	public void signup() {

		MemberVO vo = new MemberVO();

		try {

			System.out
					.print("원하시는 ID를 입력하세요.\n*숫자를 1개이상 포함한 8~15자리를 입력해주세요*\n");
			id = sc.next();

			auth.inputID(id);

			if (findId(id)) {
				System.out.println("입력하신 아이디 : " + "[" + id + "]"
						+ " (은)는 이미 존재합니다. 다시 입력해주세요.");
				return;
			}

			vo.setId(id);

			// --------------------------------------------------------
			System.out
					.print("원하시는 PASSWORD를 입력하세요.\n*숫자를 1개이상 포함한 8이상을 입력해주세요*\n");
			String pw1 = sc.next();

			if (pw1.equals(vo.getId())) {
				System.out.println("아이디와 동일한 비밀번호를 입력할 수 없습니다. 다시 입력해주세요.");
				return;
			}
			auth.inputPW(pw1);

			System.out.print("비밀번호를 한번 더 입력해주세요.\n");
			String pw2 = sc.next();
			auth.inputPW(pw2);
			auth.checkingPW(pw1, pw2);
			vo.setPw(pw1);
			// ------------------------------------------------------
			System.out.println("이름을 입력하세요.");
			vo.setName(sc.next());

			System.out.println("전화번호를 입력하세요.");
			vo.setTel(sc.next());

			System.out.println("주소를 입력하세요.");
			vo.setAddress(br.readLine());

			if (lists == null) {
				lists = new ArrayList<MemberVO>();
			}

			lists.add(vo);

			System.out.println();
			System.out.println("축하드립니다! 회원가입이 완료되었습니다.");
			// -------------------------[[자동저장]]--------------------
			if (lists != null) {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);

				fos.close();
				oos.close();
				// System.out.println("파일 저장 성공 확인프린트");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void printMemberInfo() {
		// String id;

		System.out.print("검색하고 싶은 회원 ID를 입력하세요 : ");
		id = sc.next();

		Iterator<MemberVO> it = lists.iterator();

		while (it.hasNext()) {

			MemberVO vo = it.next();
			if (vo.getId().equals(id)) {
				System.out.println(id + "님의 회원정보를 찾았습니다.\n\n");
				System.out
						.println("======================================================================================================================");
				System.out
						.println("||    Name    ||     Phone Number    ||                  Address                  ||     Status of Renting Book     ||");
				System.out
						.println("======================================================================================================================");
				System.out.println(vo.toString() + "\n\n");
			} else {
				System.out.println(id + "에 대한 회원정보가 없습니다.\n\n");
				break;
			}
		}
	}
}
