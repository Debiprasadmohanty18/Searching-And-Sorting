package com.SomeQuestionsOnBinarySearch;

public class PoisitionOfAnElementInInfiniteSortedArray {

	public static void main(String[] args) {
		
		int[] arr = {2,3,5,6,8,9,12,15,17,18,19,21,23,25,27,29,31,32,35,36,39};
		int target = 12;
		System.out.println(giveIndex(arr, target));
	}
	
	static int giveIndex(int[] arr, int target)
	{
		int st = 0;
		int end = 1;
		
		while(arr[end] < target)
		{
			st = end + 1;
			end = (st*2)+1;
		}
		
		return binarySearch(arr, target, st, end);
	}
	
	static int binarySearch(int[] arr, int target, int st, int end)
	{
		
		while(st <= end)
		{
			int mid = st + (end-st)/2;
			
			if(arr[mid] == target) return mid;
			
			else if(arr[mid] > target) end = mid-1;
			else st = mid+1;
		}
		
		return -1;
	}

}
