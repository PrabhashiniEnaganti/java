class operation
{
	public static void main(String args[])
	{
		int  a=5,b=5;
		char operator='/';
		if(operator=='/')
		{
			System.out.println("division: "+a/b);
		}
		operator='*';
		if(operator=='*')
		{
			System.out.println("multiplication: "+a*b);
		}
		operator='%';
		if(operator=='%')
		{
			System.out.println("modulus: "+a%b);
		}
	}
}