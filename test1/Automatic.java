class Automatic
{
	public static void main(String args[])
	{
		int n=76,sqr,rem=0;
		sqr=n*n;//5776
		for(;sqr>0;sqr/=10)
		{
			rem=sqr%100;//76
			break;
		}
		if(rem==n)
		{
			System.out.println("Automatic number");
		}
		else
		{
			System.out.println("not Automatic number");
		}
		
	}
}
		