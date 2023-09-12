package com.codinghub;

public class Perfect {

	public static void main(String[] args) 
	{
		 int n=6,sum=0,i;
		 for(i=1;i<n;i++)
		 {	 
			 if(n%i==0)
			 {
				 sum=sum+i;
				 System.out.println("factors of number:"+i);
                                                 
			 }
		 }
		 System.out.println(sum);

						                                                   			 	  		
		 if(sum==n)	
			 System.out.println("perfect number" );
		 else
			 System.out.println("not a perfect  number");

		 
		 
		

	}

}
