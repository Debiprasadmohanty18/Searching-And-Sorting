package com.SomeQuestionsOnLinearSearch;

public class SearchInAString {

	public static void main(String[] args) {
		String name = "Debiprasad";
		char check = 'p';
		System.out.println(searchCharacter(name, check));
	}
	
	static int searchCharacter(String s, char ch)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == ch)
				return i;
		}
		
		return -1;
	}

}
