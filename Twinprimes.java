package com.codinghub;

import java.util.Scanner;

public class Twinprimes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n1 and n2:");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int count=0,count1=0,n;
		for(int i=1;i<=n1;i++)
		{
			if(n1%i==0)
			{
				count++;
			}
		}
		System.out.println(count==2?"prime":"not prime");
		for(int j=1;j<=n2;j++)
		{
			if(n2%j==0)
			{
				count1++;
			}
		}
		if(count==2 && count1==2 && ((n1-n2==2) || (n2-n1==2)))
		{
			System.out.println("twim primes");
		}
		else
		{
			System.out.println("not twin primes");
		}
	}
}