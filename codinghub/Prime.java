package com.codinghub;

public class Prime {

	public static void main(String[] args)
	{
		int x,n=11,count=0;
		for(x=2;x<n;x++)
		{
			if(n%x==0)
			{
				count++;
				System.out.println(x);	
			}
		}
		x++;
		if(count==0)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");
	}

	}
