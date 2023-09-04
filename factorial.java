class Factorial
{
	public static void main(String args[])
	{
		int n=4,fact=1,i=1;
		while(i>=n)
		{
			fact=fact*i;
			++i;
		}
		System.out.println(" factorial of a number"+fact);
		
	}
}