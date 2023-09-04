class fact2
{
	public static void main(String args[])
	{
		int n=1,i=4,fact=1;
		while(i>=n)
		{
			fact=fact*i;
			--i;
		}
		System.out.println("backward iteration: "+fact);
	}
}