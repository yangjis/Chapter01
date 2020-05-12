package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단을 입력해 주세요.");
		System.out.println("단 : ");
		int num = scan.nextInt();
		
		int i = 1;
		while(i <= 9) {
			System.out.println( num + " * " + i + " = " +(num*i));
			i++;
		}
		
		scan.close();

	}
}
