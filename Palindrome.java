package com.codinghub;

public class Palindrome {

	public static void main(String[] args)
	{
		int n=1221,rev=0,rem,temp=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		if(temp==rev)
		{
			System.out.println("palindrome   number");
			
		}
		else
		{
			System.out.println("not a  palindrome number");
		}
		

	}

}
