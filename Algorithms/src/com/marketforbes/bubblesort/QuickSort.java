package com.marketforbes.bubblesort;

public class QuickSort {
	
	 	private int[] array;
	    private int length;

	    public void sort(int[] inputArray) {
	        // check for empty or null array
	        if (inputArray == null || inputArray.length==0){
	            return;
	        }
	        this.array = inputArray;
	        length = inputArray.length;
	        quickSort(0, length - 1);
	    }

	    private void quickSort(int low, int high) {
	        int i = low, j = high;
	        // select the pivot element. Here we are taking middle of the list as pivot element.
	        int pivot = array[low + (high-low)/2];

	        System.out.println("low:"+low);
	        System.out.println("high:"+high);
	        
	        System.out.println("pivot:"+pivot);
	        
	        
	        // Divide into two lists
	        while (i <= j) {
	        	System.out.println("in while");
	            // If the current value from the left list is smaller than the pivot element then get the next element from the left list
	            while (array[i] < pivot) {
	                i++;
	            }
	            // If the current value from the right list is larger than the pivot element then get the next element from the right list
	            while (array[j] > pivot) {
	                j--;
	            }

	            // If we have found a value in the left list which is larger than the pivot element 
	            // and/or if we have found a value in the right list which is smaller than the pivot element 
	            // then we will exchange the values
	            // We can now increase i and j

	            
	            System.out.println("i is:"+i);
	            System.out.println("j is:"+j);
	            
	            if (i <= j) {
	                exchangeElements(i, j);
	                i++;
	                j--;
	            }
	            System.out.println("i after is:"+i);
	            System.out.println("j after is:"+j);
	            
	        }
	        // Recursion
	       if (low < j)
	            quickSort(low, j);
	        if (i < high)
	            quickSort(i, high);
	    }

	    private void exchangeElements(int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	    
	    /* Printing sorted array */
		void printArray(int inputArr[]) {
			int n = inputArr.length;
			for (int i = 0; i < n; ++i)
				System.out.print(inputArr[i] + " ");
			System.out.println();
		}

		public static void main(String args[]) {
			QuickSort obj = new QuickSort();
			int inputArr[] = { 25,10,30,15,20,10,5,18,17,4,6 };
			
			System.out.println("Input Array before Quick Sort.");
			obj.printArray(inputArr);
			
			obj.sort(inputArr);
			System.out.println("\nSorted Array after Quick Sort.");
			obj.printArray(inputArr);
		}   
}
