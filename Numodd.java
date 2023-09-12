package com.codinghub;

public class Numodd {

	public static void main(String[] args) {
		int n=7372394,rem,count=0;
		for(;n>0;n/=10)
		{
			
			rem=n%10;
			if(rem%2!=0)
			{
				count++;
				System.out.println(rem+" odd number---"+count);
			}
			else
			{
				System.out.println(rem+" even number");
			}
		}
		

	}

}
