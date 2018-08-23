package com.day18.HW;

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

public class StudentImpl implements Student {
	private List<StudentVO> lists = new ArrayList<StudentVO>();

	Scanner sc = new Scanner(System.in);

	@Override
	public int input() throws Exception {
		int result = 0;

		StudentVO vo = new StudentVO();

		System.out.print("捞抚 ? ");
		vo.setName(sc.next());

		System.out.print("积老 ? ");
		vo.setBirth(sc.next());

		System.out.print("痢荐 ? ");
		vo.setScore(sc.nextInt());

		lists.add(vo);
		return 0;

	}

	
	
	@Override
	public void print() throws IOException, ClassNotFoundException {
		String path = "d:\\doc\\student_data.txt";

		// 规过 1
		File f = new File(path);

		if (!f.exists()) {

			Iterator<StudentVO> it = lists.iterator();
			while (it.hasNext()) {
				StudentVO vo = it.next();
				System.out.println(vo.toString());
			}
		} else if (f.exists()) {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);

			StudentVO ob;

			while (fis.available() > 0) {
				ob = (StudentVO) ois.readObject();
				lists.add(ob);
				
			}

			ois.close();
			fis.close();

			Iterator<StudentVO> it = lists.iterator();
			while (it.hasNext()) {
				StudentVO vo = it.next();
				System.out.println(vo.toString());
			}

		}

	}

	@Override
	public void exit() {
		try {

			FileOutputStream fos = new FileOutputStream(
					"d:\\doc\\student_data.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Iterator<StudentVO> it = lists.iterator();
			while (it.hasNext()) {
				StudentVO vo = it.next();

				oos.writeObject(vo);
			}
			oos.flush();
			fos.flush();
			oos.close();
			fos.close();

			System.exit(0);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
