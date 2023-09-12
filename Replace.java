package com.codinghub;

final class Replace {

	public static void main(String[] args) {					
		int n=4327,temp=0,rem,first=0,x=n,y,p=n,q,swap=0;
		rem=n%10;
		while(n>0)
		{
			
			first=n%10;
			n=n/10;
		}
		
		temp=rem;
		rem=first;
		first=temp;
		x=x/100;
		y=x%10;
		System.out.println(first+"  "+rem);
		System.out.println(y);
		p=p/10;
		q=p%10;
		System.out.println(q);
		swap=y;
		y=q;
		q=swap;
		System.out.println(y+"   "+q);
		System.out.println(first+""+y+""+q+""+rem);
		
		
		
		
	}

}
