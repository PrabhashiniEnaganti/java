class If
{
	public static void main(String args[])
	{
		if(true);
		{
			System.out.println("hello all");
		}
		System.out.println("no thanks");
		boolean a=true;
		boolean b=false;
		if(a);    //semicolon takes as statement so it ignores and continues
		{
			System.out.println(a);
		}
		if(b)
		{
			System.out.println(b);
		}
	}
}
		