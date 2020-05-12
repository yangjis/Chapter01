package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		int x = 0;
		int y;
		
		for(y = 1; y <=10; y++) {
			x = y + x;
		}
		System.out.println("1부터 10까지의 정수의 합은 " + x + "입니다.");
		
		
		
		System.out.println("---------------------------------------------");
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum = i + sum;
			System.out.println(i + " 까지의 합은 "+ sum);
			
		}
		
	}
}
