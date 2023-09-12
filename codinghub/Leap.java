package com.codinghub;

public class Leap {

	public static void main(String[] args) {
		int year=2023,x,y,k,z;
		if(year%4==0 || year%400==0 && year%100!=0)
		{
			System.out.println("leap year");
			x=year%100;
			if(x%2==0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
		}
			
		else
		{
			System.out.println("not a leap year");
			y=year/100;
			x=year%100;
			z=x+y;
			System.out.println(z);
			k=z%10+z/10;
			System.out.println(k);
		}
			
			
		

	}

}
