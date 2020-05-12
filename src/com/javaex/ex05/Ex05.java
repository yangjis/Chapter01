package com.javaex.ex05;

//미니로또 만들기(중복체크 X)

public class Ex05 {

	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		
		for(int i =0; i < lotto.length; i++) {
			
			int lottoNum = (int)(Math.random() * 45) + 1;

			lotto[i]= lottoNum;
			
			System.out.println(lotto[i]);
		}
		

	}
}
