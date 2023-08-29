class descending
{
	public static void main(String args[])
	{
		int a=15,b=17,c=23;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
		}
		else
		{
			if(a<b)
			{
				a=a+b;
				b=a-b;
				a=a-b;
			}
			if(a<c)
			{
				a=a+c;
				c=a-c;
				a=a-c;
			}
		}
		if(b<c)
		{
			b=b+c;
			c=b-c;
			b=b-c;
		}
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		System.out.println("c is "+c);
	}
}