package com.javaex.ex05;

//배열을 배워보자

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 2;
		intArray[4] = 55;
		
		/*System.out.println("방법1-------------------------------------------")
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);*/
		
		/*System.out.println("방법2-------------------------------------------------");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(intArray[i]);
		}*/
		
		System.out.println("방법3--------------------------------------------------");

		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		

	}
}
