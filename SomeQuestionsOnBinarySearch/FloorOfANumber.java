package com.SomeQuestionsOnBinarySearch;

public class FloorOfANumber {
	public static void main(String[] args) {
		int[] arr = { 2,4,6,8,12,16};
		int target = 13;
		System.out.println(floorNum(arr, target));
	}

	static int floorNum(int[] arr, int target) {
		int st = 0;
		int end = arr.length-1;
		
		if(target < arr[st]) return -1;
		
		while(st <= end)
		{
			int mid = st + (end-st)/2;
			
			if(arr[mid] == target) return mid;
			
			else if(arr[mid] > target) end = mid-1;
			
			else st = mid+1;
		}
		
		return end;
	}
}
