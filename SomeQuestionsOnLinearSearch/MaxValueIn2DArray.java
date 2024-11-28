package com.SomeQuestionsOnLinearSearch;

public class MaxValueIn2DArray {

	public static void main(String[] args) {
		
			int[][] arr = {
					
					{32,63,84},
					{85,86},
					{97,38,799,14}		
			};
		System.out.println(max2DValue(arr));
	}
	
	static int max2DValue(int[][] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j] > max)
					max = arr[i][j];
			}
		}
		
		return max;
	}

}
