package com.codinghub;

import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=s.nextInt();
		int rem=0,count=0,temp=0,n=a;
		for(;a>0;a/=10)
		{
			
			count++;
			
		}
		System.out.println("no.of digits: "+count);
		a=n;
		for(;a>0;a/=10)
		{
			
			rem=a%10;
			temp=temp+(int)(Math.pow(rem, count));
		}
		System.out.println(temp);
		a=n;
		System.out.println(a==temp?"armstrong":"not armstrong");

	}

}
