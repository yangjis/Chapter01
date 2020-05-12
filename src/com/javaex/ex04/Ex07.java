package com.javaex.ex04;
//6의 배수이자 14의 배수인 가장 적은 정수 찾기

public class Ex07 {

	public static void main(String[] args) {

		int i = 1;
		
		while(i < 100) {
			
			if(i%6 == 0 && i%14 == 0) {
				
				System.out.println(i);
				break;
				
			}else {
				i++;
			}
		}
		
	}
}
