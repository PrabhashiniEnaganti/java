class Palindrome
{
	public static void main(String args[])
	{
		int n=121,rem,rev=0,temp=n;
		for(;n>0;n/=10)
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		if(temp==rev)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}
	



output:palindrome