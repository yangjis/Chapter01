package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("철수야 너의 근무 시간은?");
		int time = scan.nextInt();
		
		if(time > 8) {
			int result = 8*1000 + (time - 8) * 12000;
			System.out.println(result);
		}else {
			System.out.println(time * 10000);
		}
		
		
		System.out.println("2-------------------------------------------");*/
		
		/*System.out.println("점수를 입력하세요");
		int point = scan.nextInt();
		
		if(point % 3 == 0) {
			System.out.println(point + "은 3의 배수 입니다.");
		}else {
			System.out.println(point + "은 3의 배수가 아닙니다.");
		}
		
		System.out.println("3-------------------------------------------");*/
		
		
		/*System.out.println("점수를 입력하세요 : ");
		int point = scan.nextInt();
		
		if(point >= 90) {
			System.out.println("A등급");
		}else if(point > 80 || point == 89) {
			System.out.println("B등급");
		}else if(point > 70 || point == 79) {
			System.out.println("C등급");
		}else if(point > 60 || point == 69) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
		System.out.println("4--------------------------------------------");*/
		
		/*System.out.println("숫자를 입력하세요");
		int number = scan.nextInt();
		
		if(number == 0) {
			System.out.println("0");
		}else if(number < 0) {
			System.out.println("음수");
		}else if(number % 2 == 0){
			System.out.println("짝수");
		}else if(number % 2 != 0) {
			System.out.println("양수");
		}
		
		System.out.println("5--------------------------------------------");*/
		
		/*System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		int subject = scan.nextInt();
		
		if(subject == 1) {
			System.out.println("R101호");
		}else if(subject == 2) {
			System.out.println("R202호");
		}else if(subject == 3) {
			System.out.println("R303호");
		}else if(subject == 4) {
			System.out.println("R404호");
		}else {
			System.out.println("상담원에게 문의하세요");
		}
		
		
		System.out.println("6---------------------------------------------");*/
		
		/*System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		int subject = scan.nextInt();
		
		switch(subject) {
		case 1:
			System.out.println("R101호");
			break;
			
		case 2:
			System.out.println("R202호");
			break;
		case 3:
			System.out.println("R303호");
			break;
		case 4:
			System.out.println("R404호");
			break;
		default:
			System.out.println("상담원에게 문의하세요");
		}
		
		
		System.out.println("7----------------------------------------------------");*/
		
		System.out.println("월을 입력하세요");
		int aa = scan.nextInt();
		
		switch(aa) {
		case 1:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		case 3:
			System.out.println("31일");
			break;
		case 4:
			System.out.println("30일");
			break;
		case 5:
			System.out.println("31일");
			break;
		case 6:
			System.out.println("30일");
			break;
		case 7:
			System.out.println("31일");
			break;
		case 8:
			System.out.println("31일");
			break;
		case 9:
			System.out.println("30일");
			break;
		case 10:
			System.out.println("31일");
			break;
		case 11:
			System.out.println("30일");
			break;
		case 12:
			System.out.println("31일");
			break;
		
		}
		
		System.out.println("8---------------------------------------------------------");
		
		
		

	}

}
