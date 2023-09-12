//backward iteration of prime number program and also sum of the factors
class Prime3
{
	public static void main(String args[])
	{
		int num=11,start=num,end=1,count=0,sum=0;
		while(start>=end)
		{
			if(num%start==0)
			{
				System.out.println("factors are:  "+start);
				sum=sum+start;
				count++;
			}
			start--;
		}
		System.out.println("sum of factors: "+sum);
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
}