class prime
{
	public static void main(String args[])
	{
		int i,n=4,count=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
			break;
			
		}
		if(count==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime num");
		}
	}
}