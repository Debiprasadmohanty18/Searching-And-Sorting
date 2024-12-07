package com.Sorting;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int[] arr = {-1,7,-5,0,-9,8,9,3,-7,-9};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr)
	{
		// Run for n-1 times
		for(int i=0;i<arr.length;i++)
		{
			boolean isSorted = true;  // If the Array is Sorted then In First Pass It will return.
			// After each iteration, Maximum value will come to it's respective index.
			for(int j=1;j<arr.length-i;j++)
			{
				// Swap, if the item is smaller than the previous one.
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					isSorted = false;
				}
			}
			
			if(isSorted)
				break;
		}
	}

}
