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
		System.out.print("회원코드를 입력해주세요 :");
		num = sc.nextInt();
		if (hMap.containsKey(num)) {
			System.out.println("회원코드가 이미 존재합니다.");
			System.out.println("다른 회원코드를 사용하세요.");
			return;
		}
		InfoVO vo = new InfoVO();

		System.out.print("회원의 이름을 입력해세요 : ");
		vo.setName(sc.next());

		System.out.print("회원의 나이를 입력해세요 : ");
		vo.setAge(sc.nextInt());

		System.out.print("회원의 성별을 입력해세요 : ");
		vo.setGender(sc.next());

		System.out.print("회원의 우편주소를 입력해세요 : ");
		vo.setZip(sc.nextInt());

		System.out.print("회원의 주소를 입력해세요 : ");
		vo.setAddr(sc.next());

		System.out.print("회원의 몸무게를 입력해세요 : ");
		vo.setWeight(sc.nextInt());

		System.out.print("회원의 키를 입력해세요 : ");
		vo.setHeight(sc.nextInt());

		hMap.put(num, vo);

		System.out.println("회원정보 등록 완료 !!\n");
	}

	@Override
	public void print() {
		Iterator<Integer> it = hMap.keySet().iterator();

		System.out.println("회원코드 회원이름(성별) 나이 몸무게 / 키 || 주소[우편코드]");
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
		System.out.print("검색할 회원이름을 입력해주세요 : ");
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
			System.out.println("해당하는 이름의 데이터가 존재하지 않습니다.");
		}
	}

	@Override
	public void delete() {
		System.out.print("삭제할 회원코드를 입력해주세요 : ");
		Integer num = sc.nextInt();

		if (!(hMap.containsKey(num))) {
			System.out.println("해당하는 회원코드가 존재하지 않습니다. ");
			return;
		}

		hMap.remove(num);
		System.out.println("회원정보 삭제 성공 !! ");

	}

	@Override
	public void insert() {
		System.out.print("수정할 회원코드를 입력해주세요 : ");
		Integer num = sc.nextInt();

		if (!(hMap.containsKey(num))) {
			System.out.println("해당하는 회원코드가 존재하지 않습니다. ");
			return;
		}

		InfoVO vo = hMap.get(num);
		System.out.println("회원의 몸무게? ");
		int weight = sc.nextInt();
		vo.setWeight(weight);

		System.out.println("회원정보 업데이트 완료 !! ");
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

		System.out.println("등록된 회원들의 몸무게 평균 : " + AvgOfWeight);
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
