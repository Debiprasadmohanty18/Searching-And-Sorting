package com.SomeQuestionsOnLinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = {
				
				{2,3,4},
				{5,6},
				{7,8,9,10}		
		};
		
		int target = 8;
		System.out.println(Arrays.toString(searchIn2D(arr, target)));

	}
	
	static int[] searchIn2D(int[][] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j] == target)
					return new int[] {i,j};
			}
		}
		
		return new int[] {0};
	}

}
