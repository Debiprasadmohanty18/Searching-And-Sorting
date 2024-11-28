package com.SomeQuestionsOnLinearSearch;

public class MinimumNumberInArray {

	public static void main(String[] args) {
		int[] arr = {18, 12, -7, 3, 14, 28};
		System.out.println("Minimun Value in Array is :- "+minNumber(arr));
	}
	
	static int minNumber(int[] arr)
	{
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(min > arr[i])
				min = arr[i];
		}
		
		return min;
	}

}
