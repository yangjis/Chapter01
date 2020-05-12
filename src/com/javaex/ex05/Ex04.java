package com.javaex.ex05;

//배열을 배워보자 

public class Ex04 {

	public static void main(String[] args) {
		/*//배열 선언과 동시에 초기화
		int[] intArray1 = new int[] {1,2,3,4,5};
		int[] intArray2 = {9,8,7,6,5};*/
		
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
				
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
	}
}
