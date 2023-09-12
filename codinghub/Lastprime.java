package com.codinghub;

public class Lastprime {

	public static void main(String[] args) {
		int n= 52467,i,x,count=0;
		x=n%10;
		for(i=1;i<=x;i++)
			
		{
			if(x%i==0)
			{
				count++;
				
			}
		}
	    if(count==2)
	    	System.out.println("prime number");
	    else
	    	System.out.println("not prime");
		
	}

}
