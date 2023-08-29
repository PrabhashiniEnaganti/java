class nestedif
{
	public static void main(String args[])
	{
		int a=7,b=9,c=50;
		if(a>b)//
		{
			if(a>c)
			{
				System.out.println("a is greater: "+a);
			}
			else
			{
				System.out.println("c is greater: "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is large digit: "+b);
			}
			else
			{
				System.out.println("c is largest: "+c);
			}
		}
	}
}