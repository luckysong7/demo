package com;

public class test {
	public static void main(String[] args) {
		String strDate = "16��";
		String[] strTemp = strDate.split("��");
		String seletedDate2 = strTemp[0];
		System.out.println(seletedDate2);
	}

}
