package com.score4;

interface Score {

	public void input(); // 1. 입력

	public void print(); // 2. 출력

	public void remove(); // 3. 삭제

	public void insert(); // 4. 수정 (이름은 제외)

	public void findName(); // 5. 이름검색

	public void findHak();// 6. 학번검색
	
	public boolean searchHak(String name); 

}
