class evenodd2
{
	public static void main(String args[])
	{
		int n=9;
		if(n%2==0)
		{
			System.out.println("even");
			n=n/2;
		}
		else
		{
			System.out.println("odd");
			n=(3*n+1)/2;
		}
		System.out.println("n: "+n);
	}
}