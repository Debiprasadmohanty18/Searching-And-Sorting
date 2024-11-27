package com.SomeQuestionsOnLinearSearch;

public class SearchNumberInARange {

	public static void main(String[] args) {
		int[] arr = { 18, 12, -7, 3, 14, 28};
		int target = 28;
		int stInd = 1;
		int endInd = 4;
		System.out.println(checkIndex(arr, target, stInd, endInd));
	}
	
	static int checkIndex(int[] arr, int target, int stInd, int endInd)
	{
		for(int i = stInd;i<=endInd;i++)
		{
			if(arr[i] == target)
				 return i;
 		}
		
		return -1;
	}

}
