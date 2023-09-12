package com.codinghub;

public class Reverse {

	public static void main(String[] args) {
		int n=7834,rem,rev=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		System.out.println("reverse of a number:  "+rev);

	}

}
