package com.tanmay.LeetCodeEasyProblems;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3},
				{3,2,1},
				{6,9}
		};
		
		System.out.println(maximumWealth(arr));

	}
	
	static int maximumWealth(int[][] acc) 
	{
		int max = Integer.MIN_VALUE;
        for(int i=0;i<acc.length;i++)
        {
        	int sum = 0;
        	for(int j=0;j<acc[i].length;j++)
        	{
        		sum+= acc[i][j];
        	}
        	
        	if(sum > max)
        	{
        		max = sum;
        	}
        }
        
        return max;
    }

}
