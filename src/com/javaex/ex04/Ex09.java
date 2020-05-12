package com.javaex.ex04;
//1~20까지의 수에서 2의 배수와 3의 배수를 제외한 숫자를 출력하세요.
public class Ex09 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++) {
			if(i%2  == 0 || i%3 == 0) {
				continue;
			}else {
			System.out.println(i);
			}
		}
		
	}
}
