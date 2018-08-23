package com.day17.stream;

import java.io.File;
import java.io.FileFilter;

// FileFilter 인테페이스 
// File클래스의 ListFile 메소드로 리턴받을 대상을 지정할수 있는 필터 인터페이스
// 대상은 accept로 지정한다. 

class MyFileList implements FileFilter {

	private File f;

	// 의존성 주입
	public MyFileList(String filePath) {
		f = new File(filePath);
	}

	public void result() {
		try {
			if (!f.exists()) {
				System.out.println("파일이 존재하지 않습니다 !! ");
				return;
			}

			System.out.println("절대 경로 : " + f.getAbsolutePath());
			System.out.println("파일 크기 : " + f.length());

			// 폴더인 경우
			if (f.isDirectory()) {
				// accept 메소드에서 FileFilter 인터페이스로 리턴할 대상을 지정
				File[] lists = f.listFiles(this);

				System.out.println("\n폴더의 내용... ");
				for (int i = 0; i < lists.length; i++) {
					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());
				}
			}

			System.out.println("\n디렉토리 구조...");
			File[] root = File.listRoots();
			for (int i = 0; i < root.length; i++) {
				System.out.println(root[i].getPath());
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public boolean accept(File pathName) {

		return pathName.isFile() || pathName.isDirectory();
	}

}

public class Test13 {
	public static void main(String[] args) {
		MyFileList mf = new MyFileList("d:\\");
		mf.result();
	}
}
