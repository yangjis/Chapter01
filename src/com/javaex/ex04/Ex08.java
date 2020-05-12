package com.javaex.ex04;
//숫자를 입력받아 3의 배수인지 판별.
//0이 입력되면 프로그램이 종류

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			float num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("종료");
				break;
			}else if(num%3 != 0){
				System.out.println("3의 배수가 아닙니다.");
			}else{
				System.out.println("3의 배수입니다.");
			}
		}
	}

}
