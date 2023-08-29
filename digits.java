class digits
{
	public static void main(String args[])
	{
		int num=100;
		if(num>=0 && num<=9)
			System.out.println("single digit");
		if(num>=10 && num<=99)
			System.out.println("two-digit");
		if(num>=100 && num<=999)
			System.out.println("three digit");
		else
			System.out.println("more than 3digits");
	}
}
