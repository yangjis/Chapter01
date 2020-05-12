package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 6 ; i++) {
			for(int z = 0; z < 6 ; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------");
		
		for(int x = 0; x < 6; x++) {
			
//			for(int y = 0; y <= x; y++) {	//별 수 늘리기
//				System.out.print("*");
//			}
			
			for(int y = 5; y >= x; y--) {	//별 수 줄이기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
