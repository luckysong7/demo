package com.health;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class InfoImpl<T> implements Info {

	Scanner sc = new Scanner(System.in);
	private Map<Integer, InfoVO> hMap = new TreeMap<Integer, InfoVO>();

	Integer num;

	@Override
	public void input() {
		System.out.print("ȸ���ڵ带 �Է����ּ��� :");
		num = sc.nextInt();
		if (hMap.containsKey(num)) {
			System.out.println("ȸ���ڵ尡 �̹� �����մϴ�.");
			System.out.println("�ٸ� ȸ���ڵ带 ����ϼ���.");
			return;
		}
		InfoVO vo = new InfoVO();

		System.out.print("ȸ���� �̸��� �Է��ؼ��� : ");
		vo.setName(sc.next());

		System.out.print("ȸ���� ���̸� �Է��ؼ��� : ");
		vo.setAge(sc.nextInt());

		System.out.print("ȸ���� ������ �Է��ؼ��� : ");
		vo.setGender(sc.next());

		System.out.print("ȸ���� �����ּҸ� �Է��ؼ��� : ");
		vo.setZip(sc.nextInt());

		System.out.print("ȸ���� �ּҸ� �Է��ؼ��� : ");
		vo.setAddr(sc.next());

		System.out.print("ȸ���� �����Ը� �Է��ؼ��� : ");
		vo.setWeight(sc.nextInt());

		System.out.print("ȸ���� Ű�� �Է��ؼ��� : ");
		vo.setHeight(sc.nextInt());

		hMap.put(num, vo);

		System.out.println("ȸ������ ��� �Ϸ� !!\n");
	}

	@Override
	public void print() {
		Iterator<Integer> it = hMap.keySet().iterator();

		System.out.println("ȸ���ڵ� ȸ���̸�(����) ���� ������ / Ű || �ּ�[�����ڵ�]");
		System.out
				.println("---------------------------------------------------------");
		while (it.hasNext()) {
			Integer key = it.next();
			InfoVO vo = hMap.get(key);

			System.out.println(key + " " + vo.toString());

		}
		System.out.println();

	}

	@Override
	public void findName() {
		System.out.print("�˻��� ȸ���̸��� �Է����ּ��� : ");
		String name = sc.next();

		Iterator<Integer> it = hMap.keySet().iterator();
		boolean flag = false;

		while (it.hasNext()) {
			Integer key = it.next();
			String name2 = hMap.get(key).getName();
			if (name2.equals(name)) {
				System.out.println(hMap.get(key));
				flag = true;
			}

		}
		if (!flag) {
			System.out.println("�ش��ϴ� �̸��� �����Ͱ� �������� �ʽ��ϴ�.");
		}
	}

	@Override
	public void delete() {
		System.out.print("������ ȸ���ڵ带 �Է����ּ��� : ");
		Integer num = sc.nextInt();

		if (!(hMap.containsKey(num))) {
			System.out.println("�ش��ϴ� ȸ���ڵ尡 �������� �ʽ��ϴ�. ");
			return;
		}

		hMap.remove(num);
		System.out.println("ȸ������ ���� ���� !! ");

	}

	@Override
	public void insert() {
		System.out.print("������ ȸ���ڵ带 �Է����ּ��� : ");
		Integer num = sc.nextInt();

		if (!(hMap.containsKey(num))) {
			System.out.println("�ش��ϴ� ȸ���ڵ尡 �������� �ʽ��ϴ�. ");
			return;
		}

		InfoVO vo = hMap.get(num);
		System.out.println("ȸ���� ������? ");
		int weight = sc.nextInt();
		vo.setWeight(weight);

		System.out.println("ȸ������ ������Ʈ �Ϸ� !! ");
	}

	@Override
	public void showAvgOfWeight() {
		Iterator<Integer> it2 = hMap.keySet().iterator();
		float SumofWeight = 0;
		while (it2.hasNext()) {
			Integer key = it2.next();
			InfoVO vo = hMap.get(key);

			SumofWeight += vo.getWeight();

		}

		float AvgOfWeight = SumofWeight / hMap.size();

		System.out.println("��ϵ� ȸ������ ������ ��� : " + AvgOfWeight);
	}

	@Override
	public void printOrderbyHeight() {

		Map<Object, Object> valSort = sortByValue(hMap, true);

		for (Object key : valSort.keySet()) {
			System.out.print(key + ": " + valSort.get(key) + "\n");
		}

	}

	//
	// public static List sortByValue(final Map hMap) {
	//
	// List<Integer> list = new ArrayList<Integer>();
	// list.addAll(hMap.keySet());
	//
	// Collections.sort(list,new Comparator() {
	//
	// @Override
	// public int compare(Object o1, Object o2) {
	// Object v1 = hMap.get(o1);
	// Object v2 = hMap.get(o2);
	//
	// return ((Comparable) v2).compareTo(v1);
	// }
	//
	// });
	// return list;
	//
	// }

	private Map<Object, Object> sortByValue(Map<Integer, InfoVO> hMap2,
			boolean b) {
		
		List list = new LinkedList(hMap2.entrySet());

		Collections.sort(list, new Comparator<T>() {

			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
						.compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		if (b) {
			Collections.reverse(list);
		}
		
		HashMap<Object, Object> sortedHashMap = new LinkedHashMap<Object, Object>();

		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}

		return sortedHashMap;

	}
}
