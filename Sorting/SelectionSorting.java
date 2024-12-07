package com.Sorting;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		
		int[] arr = {0,7,3,-2};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int st = 0;
			int last = arr.length-i-1;
			int max = getMaxValue(arr, st, last);
			swapping(arr, max, last);
		}
	}
	
	static void swapping(int[] arr, int max, int last)
	{
		int temp = arr[max];
		arr[max] = arr[last];
		arr[last] = temp;
	}
	
	static int getMaxValue(int[] arr, int start, int end)
	{
		int maxValue = start;
		for(int i=start;i<=end;i++)
		{
			if(arr[i] > arr[maxValue])
				maxValue = i;
		}
		
		return maxValue;		
	}

}
