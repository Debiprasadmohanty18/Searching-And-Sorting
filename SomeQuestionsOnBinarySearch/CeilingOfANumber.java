package com.SomeQuestionsOnBinarySearch;

public class CeilingOfANumber {

	public static void main(String[] args) {
		int[] arr = { 2,4,6,8,12,16};
		int target = 9;
		System.out.println(ceilingNum(arr, target));
	}

	static int ceilingNum(int[] arr, int target) {
		int st = 0;
		int end = arr.length-1;
		
		if(target > arr[end]) return -1;
		
		while(st <= end)
		{
			int mid = st + (end-st)/2;
			
			if(arr[mid] == target) return mid;
			
			else if(arr[mid] > target) end = mid-1;
			
			else st = mid+1;
		}
		
		return st;
	}

}
