package com.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class LottoMain {

	Random random = new Random();
	// �������� ����
	private int command = 0;

	private BufferedReader in;
	private LottoPro program = null;

	// code ��
	public final int RECOMMANDATION_NUMBER = 1;
	public final int PRINT_NUMBER = 2;
	public final int EXIT = 3;

	public LottoMain() throws InterruptedException {
		in = new BufferedReader(new InputStreamReader(System.in));

		program = new LottoPro(true);

		start(); // �����Լ� ������ ����Ǵ� ���� �ƴ� , �����Լ��� ������
		// �ڱ��ڽ��� �ν��Ͻ��� ���� ����ǹǷ� static
	}

	public static void main(String[] args) throws InterruptedException {
		new LottoMain(); // ��ü�� ���� �ʿ�������� �ν��Ͻ��� ������ش�.
	}

	public class LottoPro {
		private boolean duplicate = false;
		private boolean can_bonus;
		private int[] numbers;

		public LottoPro() {
			System.out.println("(System) ���ʽ���÷�� �Ұ��մϴ�.");
			can_bonus = false;

		}

		public LottoPro(boolean can_bonus) {
			System.out.println("(System) ���ʽ���÷�� �����մϴ�.");
			this.can_bonus = can_bonus;
		}

		// ��ȣ ���
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

		// ���ʽ���ȣ �̱�
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

		// ��ȣ �̱�
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
		System.out.println("�ζ� ���α׷��� ���۵˴ϴ�.");
		for (int i = 1; i < 11; i++) {
			System.out.println(i * 10 + "%");
			Thread.sleep(200);
			if (i == 10) {
				System.out.println("ȯ���մϴ� !!");
			}
		}
		System.out.println();

		do {
			System.out.println("-----------MENU-----------");
			System.out.println("1. ��÷ 2. ���� 3. ������");
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
