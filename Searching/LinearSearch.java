package com.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {34, 12, 67, 49, 27};
		int target = 67;
		System.out.println(linearSearch(arr, target));
	}
	
	static int linearSearch(int[] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == target)
				return i;
		}
		
		return -1;
	}

}
