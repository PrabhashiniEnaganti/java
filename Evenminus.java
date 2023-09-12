package com.codinghub;

public class Evenminus {

	public static void main(String[] args) {
		int n=7862,rem,sub=0,rev=0,rem1;
		System.out.println("intial num: "+n);
		for(;n!=0;n/=10)
		{
			rem=n%10;//2//6
			if(rem%2==0)//2//true
			{
				sub=sub*10+rem-1;//0*10+2-1//1//1*10+6-1//10+5//15
				
			}
			else
			{
				sub=sub*10+rem+1;//7+1//8
				
			}
			
		}
		System.out.println("after sub and add: "+sub);
		for(;sub>0;sub/=10)
		{
			rem1=sub%10;
			rev=rev*10+rem1;
		}
		System.out.println("actual number  "+rev);

	}

}
