 class Multiplecal 
{
  public static void main(String[] args) 
{
    int num=113,rem=0,temp=num,rev=0,rem1=0,sum=0,n=num,add=0,n1=n,mul=1,count=0,i,j,fact=1;
    
    for(;num>0;num=num/10)
    {
    	rem=num%10;
        rev=rev*10+rem;
         mul*=rem;
     }
     System.out.println(rev);
     if(temp==rev)
     {
     	System.out.println("palindrome");
        for(;n>0;n=n/10)
        {
        	
        	rem1=n%10;
            sum+=Math.pow(rem1,3);
            
        }
        System.out.println(sum);
        if(n1==sum)
        {
        	System.out.println("armstrong");
            
        }
        else
        {
         	System.out.println("not armstrong");
         }
   
     }
     else
     {
     	System.out.println("not palindrome");
       
        System.out.println(mul);
        for(i=2;i<=mul;i++)
        {
        	if(mul%i==0)
            {
            	count++;
            }
        }
        if(count==1)
        {
        	System.out.println("prime number "+mul);
            for(j=1;j<=mul;j++)
            {
            	fact=fact*j;
            }
            System.out.println("factorial is: "+fact);
        }
        else
        {
        	System.out.println("not prime number  "+mul);
       		if(mul%2==0)	
        	{
        		System.out.println(mul+" is even number  "+mul/2); 
        	}
        	else
        	{
        	System.out.println(mul+" is odd number  "+mul*2);
           	}
     	}
     }
     
  }
}
