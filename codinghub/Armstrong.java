package com.codinghub;

public class Armstrong {

	public static void main(String[] args) 
	{
		int  n=153,temp=n,rem,sum=0;
		while(n>0)
		{
			rem=n%10;			
			
			sum+=Math.pow(rem, 3);//sum=sum+(rem*rem*rem)
			n=n/10;
		}
		if(temp==sum)
			System.out.println("It is  armstrong");
		else
			System.out.println("not armstrong number");
		
	}

}