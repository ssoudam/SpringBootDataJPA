package com.marketforbes.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {2,4,1,3,7,6,5,8};
		System.out.println("Before Sorting :");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("\nAfter Sorting :");
		printArray(arr);
		

	}

	 public static void printArray(int[] arr) {
		 for(int i=0;i<arr.length;i++) {
			     System.out.print(arr[i]+" ");
		 }
	 } 
		 
	 public static void	bubbleSort(int[] arr) {
		 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length -1;j++) {
				 
				 if(arr[j] >arr[j+1]) {
					 
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1]= temp;
					 
					 
					 
				 }
				 
			 }
			 
		 }
		 
	 }
		 
	 
	
}
