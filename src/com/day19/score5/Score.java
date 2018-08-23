package com.day19.score5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {

	private List<ScoreVO> lists = null; // ó������ null �� ����
	private String path = System.getProperty("user.dir");

	private File f = new File(path, "\\data\\score.txt");

	@SuppressWarnings("unchecked")
	public Score() throws IOException, ClassNotFoundException {

		// ������ ������ ��� �����
		if (!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();
		}

		if (f.exists()) {
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);

			lists = (ArrayList<ScoreVO>) ois.readObject();

			fis.close();
			ois.close();

		}

	}

	public void writeFile() { // ��������

		try {
			if (lists != null) {

				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);

				fos.close();
				oos.close();

				System.out.println("����  ���� ����");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void print() { // ���
		Iterator<ScoreVO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}
	}

	public void input() {

		ScoreVO vo = new ScoreVO();
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� ?");
		vo.setName(sc.next());
		System.out.print("���� ?");
		vo.setBirth(sc.next());
		System.out.print("���� ?");
		vo.setScore(sc.nextInt());
		if (lists == null) {
			lists = new ArrayList<ScoreVO>();
		}

		lists.add(vo);

	}
}
