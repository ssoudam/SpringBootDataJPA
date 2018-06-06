package com.marketforbes.bubblesort;

public class Factorial {

	public static int fact(int n) {
		if(n == 0 ) {
			return 1;
	
		}else {
		return n*fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		int factorial = fact(0);
		System.out.println("Factorial is:"+factorial);
		
		
	}

}
