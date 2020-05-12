package com.javaex.ex05;

//배열 복사

public class Ex06 {

	public static void main(String[] args) {
		int[] arrA = new int[3];
		int[] arrB = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		for(int i = 0; i < arrA.length; i++) {
			arrB[i] = arrA[i];
			
			System.out.println("arrA[" + i + "]= " + arrA[i]);
		}
		
		System.out.println("----------------------------");
		
		for(int i = 0; i < arrB.length; i++) {
			System.out.println("arrB[" + i + "]= " + arrB[i]);
		}
		
		arrA[1] = 10;
		
		System.out.println("--------------------변경 후------------------------------");
		
		for(int i = 0; i < arrA.length; i++) {
			
			System.out.println("arrA[" + i + "]= " + arrA[i]);
		}
		
		System.out.println("----------------------------");
		
		for(int i = 0; i < arrA.length; i++) {
			System.out.println("arrB[" + i + "]= " + arrB[i]);
		}

	}
}
