package com.javaex.ex05;

//while문을 사용해 보자

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int result;
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		/*do {
			result = scan.nextInt();
			sum = sum + result;
			System.out.println("합계: " + sum);
		}while(result != 0);
		System.out.println("종료");
		
		*
		*System.out.println("-----------------------------------------------------------------");
		*/
		
		
		
		/*while(true) {
			result = scan.nextInt();
			sum = sum + result;
			System.out.println("합계: " + sum);
			
			if(result == 0) {
				break;
			}
			
		}
		System.out.println("종료");
		
		System.out.println("--------------------------------------------------------------------");
		*/
		
		
		
		
		
		boolean flag =true;
		
		while(flag) {
			result = scan.nextInt();
			sum = sum + result;
			System.out.println("합계: " + sum);
			
			if(result == 0) {
				flag = false;
			}
			
		}
		System.out.println("종료");
		
		System.out.println("--------------------------------------------------------------------");
		
		
		
		scan.close();
	}
}
