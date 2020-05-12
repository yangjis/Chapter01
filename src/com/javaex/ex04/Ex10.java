package com.javaex.ex04;
//사용자의 숫자를 입력받아 더하는 프로그램(0이면 종료)

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int result = 0;
		int num = 0;
		
		do{
			System.out.println("숫자를 입력하세요. [0이면 종료]");
			num = scan.nextInt();
			
			result = sum + num;
			sum = result;
			
			System.out.println("합계: " + sum);
			
		}while(num != 0);
		
		System.out.println("졸료");
		
		scan.close();
	}
}
