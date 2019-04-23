package com.java0423;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("특수 문자 출력");
		/*************************************
		 * 특수 문자 >> \
		 * \n  : 한줄 이동
		 * \'  : '  > 문자 : ''
		 * \uD64D : 홍
		 * \u005c : \
		 *************************************/
		System.out.println("\\");
		
		// 출력 결과 :  \ 
		System.out.println("출력 결과 : \u005c\u005c");
	}

}
