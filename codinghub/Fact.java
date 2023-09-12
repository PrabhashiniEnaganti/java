package com.codinghub;

public class Fact {

	public static void main(String[] args) 
	{
		int n,a=0,sum=0,i,fact=1;
		for(n=2321;n>0;n=n/10)
		{
				a=n%10;
				sum=sum+a;
				System.out.println(a);
				System.out.println("sum of that num:  "+sum);
				
		}
		
		for(i=1;i<=sum;i++)
		{
			fact=fact*i;
			if(sum%i==0)
				System.out.println(i);
		}
		System.out.println(fact);
	
	}

}