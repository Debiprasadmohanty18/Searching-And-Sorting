package com.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2,4,6,8,12,16};
		int target = 8;
		System.out.println(binarySearch(arr, target));
	}
	
	static int binarySearch(int[] arr, int target)
	{
		int st = 0;
		int end = arr.length-1;
		
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
