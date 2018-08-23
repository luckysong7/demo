package com.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class LottoMain {

	Random random = new Random();
	// 전역변수 선언
	private int command = 0;

	private BufferedReader in;
	private LottoPro program = null;

	// code 값
	public final int RECOMMANDATION_NUMBER = 1;
	public final int PRINT_NUMBER = 2;
	public final int EXIT = 3;

	public LottoMain() throws InterruptedException {
		in = new BufferedReader(new InputStreamReader(System.in));

		program = new LottoPro(true);

		start(); // 메인함수 내에서 실행되는 것이 아닌 , 메인함수가 생성한
		// 자기자신의 인스턴스에 의해 실행되므로 static
	}

	public static void main(String[] args) throws InterruptedException {
		new LottoMain(); // 객체가 딱히 필요없을때는 인스턴스만 만들어준다.
	}

	public class LottoPro {
		private boolean duplicate = false;
		private boolean can_bonus;
		private int[] numbers;

		public LottoPro() {
			System.out.println("(System) 보너스추첨은 불가합니다.");
			can_bonus = false;

		}

		public LottoPro(boolean can_bonus) {
			System.out.println("(System) 보너스추첨은 가능합니다.");
			this.can_bonus = can_bonus;
		}

		// 번호 출력
		public void prinnumber() {
			if (numbers == null || numbers[0] == 0) {
				System.out.println("(System)Empty Value");
				return;
			}
			for (int i = 0; i < numbers.length; i++) {
				if (i == 6) {
					System.out.println("(Bonus) >>> " + numbers[i]);
				} else {
					System.out.print(numbers[i] + " ");
				}
			}
		}

		public int[] start_recommendation() {
			if (can_bonus) {
				numbers = new int[7];
			} else {
				numbers = new int[6];
			}

			int[] imsi = getNormalNumber();
			for (int i = 0; i < numbers.length; i++) {
				if (i == 6) {
					numbers[i] = getBonusNumber(numbers);
				} else {
					numbers[i] = imsi[i];
				}
			}

			return numbers;

		}

		// 보너스번호 뽑기
		private int getBonusNumber(int[] normal_number) {
			int bonus = 0;
			int imsi = 0;
			while (true) {
				imsi = random.nextInt(45) + 1;
				for (int j = 0; j < normal_number.length; j++) {
					if (imsi == normal_number[j]) {
						duplicate = true;
					}
				}
				if (duplicate) {
					duplicate = false;
					continue;

				} else {
					break;
				}
			}
			bonus = imsi;
			System.out.println("(System) Success Create Bonus Number");
			return bonus;

		}

		// 번호 뽑기
		private int[] getNormalNumber() {
			int[] normal_number = new int[6];
			int imsi = 0;
			for (int i = 0; i < normal_number.length; i++) {
				imsi = (int) (Math.random() * 45 + 1);
				// imsi = random.nextInt(45) +1;
				for (int j = 0; j < i; j++) {
					if (normal_number[j] == imsi) {
						duplicate = true;
					}
				}
				if (!duplicate) {
					normal_number[i] = imsi;
				} else {
					duplicate = false;
					i--;
				}
			}
			System.out.println("(System) Success Create Normal Number");

			return normal_number;
		}

	}

	public void start() throws InterruptedException {
		System.out.println("로또 프로그램이 시작됩니다.");
		for (int i = 1; i < 11; i++) {
			System.out.println(i * 10 + "%");
			Thread.sleep(200);
			if (i == 10) {
				System.out.println("환영합니다 !!");
			}
		}
		System.out.println();

		do {
			System.out.println("-----------MENU-----------");
			System.out.println("1. 추첨 2. 보기 3. 끝내기");
			System.out.println("--------------------------");
			System.out.println(">>");
			try {
				this.command = Integer.parseInt(in.readLine());
			} catch (IOException e) {
				System.out.println("(System)IOException !! try agrain..");
				continue;
			}
			switch (this.command) {
			case RECOMMANDATION_NUMBER:
				program.start_recommendation();
				break;

			case PRINT_NUMBER:
				program.prinnumber();
				break;
				
			case EXIT:
				System.out.println("(System)bye!");
				return;
			}

		} while (true);

	}

}
