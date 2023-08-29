class while3
{
	public static void main(String args[])
	{
		int n=1,sum=0,mul=1;
		while(n<=50)
		{
			if(n%2==0)
			{
				sum=sum+n;
				
			}
			else
			{
				mul=mul*n;
				
		
			}
			++n;
		}
		System.out.println("sum of even numbers"+sum);
		System.out.println("multiplication of odd numbers"+mul);
	}
}