package com.codinghub;

public class Firstlast {

	public static void main(String[] args) {
		int  last=0,n=72875,sum=0,first=0;
		last=n%10;
		System.out.println(last);
		while(n!=0)
		{
			first=n%10; 
			n=n/10;
			
		}
		System.out.println(first);
		sum=first+last;
		System.out.println(sum);
		
		
		
		
		
		
		
		

	}

}