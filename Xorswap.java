class xorswap
{
	public static void main(String args[])
	{
		int a=999,b=1000;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}
}