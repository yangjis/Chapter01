package com.javaex.ex05;

//continue문 사용하기 및 대체사용 방법. 

public class Ex01 {
	public static void main(String[] args) {
		
		for(int y = 1; y <= 20; y++) {
			if(!(y%2 ==0 || y%3 == 0)) {
				System.out.println(y);
			}
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		
		for(int x = 1; x <= 20; x++) {
			if(x%2 == 0 || x%3 == 0) {
				
			}else {
			System.out.println(x);
			}
		}
		
		
		System.out.println("---------------------------------------------------------------");
		
		
		for(int i = 1; i <= 20; i++) {
			if(i%2 == 0 || i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
