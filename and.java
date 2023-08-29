class and
{
	public static void main(String args[])
	{
		int a=3,b=7;
		if(a>=2 && ++b==8)
			System.out.println("true");
		else
			System.out.println("false");
		if(a==2 || ++b==9) //here b value is updated in above condition
			System.out.println("T");
		else
			System.out.println("F");
	}
}
	