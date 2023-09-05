class perfect
{
	public static void main(String args[])
	{
		int n=70,i=1,sum=0;
		while(i<n)//(or) while(i<=n)
		{
			if(n%i==0)
			{
				sum=sum+i;
		
			}
			i++;
		}
		if(sum==n)//(or) if(sum/2==n)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
	}
}