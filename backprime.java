class Prime3
{
	public static void main(String args[])
	{
		int num=11,start=num,end=1,count=0;
		while(start>=end)
		{
			if(num%start==0)
			{
				count++;
			}
			start--;
		}
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