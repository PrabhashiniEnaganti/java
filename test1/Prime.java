class prime
{
	public static void main(String args[])
	{
		int n=6,i,count=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
}