package com.codinghub;

import java.util.Scanner;

public class Palindromeprime {

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int i,count=0,rem=0,rev=0,temp=n;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(n+" prime number");
		}
		else
		{
			System.out.println(n+"  not a prime number");
		}
		for(;n>0;n/=10)
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		n=temp;
		System.out.println(rev);
		if(count==1 && n==rev)
		{
			System.out.println("palindrome prime");
		}
		else
		{
			System.out.println("not a palindrome prime");
		}
		
		

	}

}
