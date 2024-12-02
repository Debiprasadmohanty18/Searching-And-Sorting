package com.SomeQuestionsOnBinarySearch;

public class FindInMountainArray {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,3,1};
		int target = 3;
		System.out.println(searchAns(arr, target));
	}
	
	static int searchAns(int[] arr, int target)
	{
		int ans = peakIndexInMountainArray(arr); 
		if(target > arr[ans])
			return binarySearch(arr, target, ans, arr.length-1);
		else if (target < arr[ans])
			return binarySearch(arr, target, 0, ans-1);
		else
			return ans;
	}
	
	static int peakIndexInMountainArray(int[] arr) 
	{
        int st = 0;
        int end = arr.length-1;
        
        while(st <= end)
        {
        	int mid = st + (end-st)/2;
        	
        	if(arr[mid] > arr[mid+1])
        	{
        		if(arr[mid] > arr[mid-1])
        			return mid;
        		else
        			end = mid;
        	}
        	else
        		st = mid+1;
        }
        
        return -1;
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
