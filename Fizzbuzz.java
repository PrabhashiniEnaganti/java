class fizzbuzz
{
	public static void main(String args[])
	{
		int n=7;
		if(n%3==0)
		{
			if(n%5==0)
			{
				System.out.println("Fizzbuzz");
			}
			else
			{
				System.out.println("Fizz");
			}

		}
		else if(n%5==0)
		{
			System.out.println("buzz");
		}
		else
		{
			System.out.println("n: "+n);					
		}
	}
}