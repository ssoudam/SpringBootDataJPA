package com.marketforbes.bubblesort;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="AARIT",reverse="";
		
		char[] ch=str.toCharArray();
		for(int i = ch.length -1 ;i>=0;i--) {
			
			reverse+= ch[i];
			
		}

		System.out.println("reverse string is:"+reverse);
	}

}
