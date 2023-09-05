class Prime
{
	public static void main(String args[])
	{
		int n=20,i=1,count=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				count+=1;
			}
			i++;
		}
		if(count==2)//if i=2 then count==1
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
}