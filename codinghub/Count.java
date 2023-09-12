package com.codinghub;

public class Count {

	public static void main(String[] args) {
		int n=102837,count=0,rem=0,add=0;
		while(n>0)
		{
			count++;
			rem=n%10;
			n=n/10;
		
		if(count==2 ||count==5)
		{
			add+=rem;
			System.out.println(rem);
			
		}
		}
		System.out.println("addition: "+add);
		

	}

}
