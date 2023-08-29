class swap
{
	public static void main(String args[])
	{
		int a=3;
		int b=6;//without using 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;
		int c=12;
		int d=15;
		c=c*d;
		d=c/d;
		c=c/d;
		System.out.println(c+"\n"+d);
		System.out.println(a);
		System.out.println(b);
	}
}