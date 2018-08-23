package com.naver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.score3.ScoreVO;

public class NaverImpl implements Naver {

	Scanner sc = new Scanner(System.in);

	private List<NaverVO> lists = new ArrayList<NaverVO>();

	@Override
	public void input() throws Exception {
		NaverVO vo = new NaverVO();

		// 아이디 입력받기
		try {
			System.out.print("아이디를 입력하세요 : ");

			String id2 = sc.next();

			Iterator<NaverVO> it = lists.iterator();

			while (it.hasNext()) {
				NaverVO vo2 = it.next();
				if (id2.equals(vo2.getId())) {
					throw new Exception("이미 아이디가 존재합니다.");
				}
			}
			vo.setId(id2);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		// 비밀번호 입력받기
		boolean flag = false; // 숫자 확인
		boolean flag2 = false; // 문자 확인
		try {
			System.out.print("비밀번호를 입력하세요 : ");
			String pw1 = sc.next();
			// 비밀번호 재확인
			System.out.println(pw1);
			System.out.print("비밀번호를 한번더 입력하세요 : ");
			String pw2 = sc.next();

			for (int i = 0; i < pw1.length(); i++) {
				char chr = pw1.charAt(i);
				if (!(chr > 'A' || chr < 'Z') && !(chr > 'a' || chr < 'z')
						&& !(chr > '1' || chr < '9')) {
					throw new Exception("문자만 입력해주세요");
				}

				if (chr >= '1' && chr <= '9') {
					flag = true;
				}
				if (chr >= 'A' && chr <= 'Z' || chr >= 'a' && chr <= 'z') {
					flag2 = true;
				}
			}

			if (!pw1.equals(pw2)) {
				throw new Exception("비밀번호가 서로 일치 하지 않습니다.");
			} else if (!flag && flag2) {
				throw new Exception("숫자도 혼용해서 입력해주세요");
			} else if (flag && !flag2) {
				throw new Exception("문자도 혼용해서 입력해주세요");
			}
			vo.setPw(pw1);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// 이름 입력받기
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		vo.setName(name);

		// 성별 입력받기
		try {
			System.out.print("성별을 입력하세요 [남자 OR 여자]: ");
			String gender = sc.next();

			if (!(gender != "남자" && gender != "여자")) {
				throw new Exception("성별입력오류");
			}
			vo.setGender(gender);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// 생일 입력받기
		try {
			System.out.print("생년월일 입력하세요 [XXXXXXXX] : ");
			String birth = sc.next();
			if (!(birth.length() == 8)) {
				throw new Exception("생년월일형식이 일치하지 않습니다.");
			}

			String birth2 = birth.trim();
			// String temp = birth2.substring(0, 4);
			// String temp2 = birth2.substring(4, 6);
			// String temp3 = birth2.substring(6);
			// String birth3 = temp;
			// birth3.concat("-");
			// birth3.concat(temp2);
			// birth3.concat("-");
			// birth3.concat(temp3);
			vo.setBirth(birth2);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		// 이메일 입력받기
		System.out.print("이메일을 입력해주세요 : ");
		String email = sc.next();
		System.out.println(email);
		vo.setEmail(email);

		try {
			System.out.print("핸드폰번호를 입력해주세요 : ");
			String tel = sc.next();
			String[] arr = tel.split("-");
			if (!(arr[0].equals("010"))) {
				throw new Exception("대한민국 핸드폰 번호가 아닙니다. ");
			}

			vo.setTel(tel);
		} catch (Exception e) {
			e.toString();
		}

		lists.add(vo);

	}

	@Override
	public void print() {
		System.out.printf("%10s %10s %4s %3s %15s %20s %20s\n", "이름", "비번",
				"이름", "성별", "생년월일", "이메일", "폰번호");
		System.out
				.println("---------------------------------------------------------------------------------");

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			System.out.println(vo.toString());
		}
	}

	@Override
	public void searchId() {
		String name;
		System.out.print("검색하고 싶은 이름을 입력해주세요 : ");
		name = sc.next();

		Iterator<NaverVO> it = lists.iterator();

		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (vo.getName().equals(name)) {
				System.out.println(name + "의 정보를 찾았습니다.");
				System.out.println(vo.toString());
				break;

			} else {
				System.out.println("해당하는 이름이 존재하지 않습니다. ");
				break;
			}
		}
	}

}
