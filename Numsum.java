package com.codinghub;

public class Numsum {

	public static void main(String[] args) {
		int n=12345,sum=0,rem,mul=1,count=0;
		for(;n>0;n=n/10)
		{
			rem=n%10;
			sum=sum+rem;
			mul=mul*rem;
			count++;
		}
		System.out.println("sum of digits: "+sum);
		System.out.println("multiply all digits: "+mul);
		System.out.println("number of digits: "+count);
 		  

	}

}
