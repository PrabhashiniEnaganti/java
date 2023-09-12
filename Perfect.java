class perfect
{
	public static void main(String args[])
	{
		int x=11;
		double y=(int)Math.sqrt(x);
		y=y*y;
		System.out.println(y);
		if(y==x)
		{
			System.out.println(x+ " is perfect number");
		}
		else
		{
			System.out.println(x+" is not a perfect number");
		}
	}
}
		