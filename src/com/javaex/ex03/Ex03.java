package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int point;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		point = scan.nextInt();
		
		if(point > 0) {
			System.out.println("양수");
		}else if(point < 0){
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
		scan.close();
		
	}

}
