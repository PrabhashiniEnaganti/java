class character
{
	public static void main(String args[])
	{
		char x='#';
		System.out.println("Ascii values");
		 if((x>=65)&&(x<=90))
		{
			System.out.println("uppercase letter");
		}
		else if((x>=97)&&(x<=122))
		{
			System.out.println("lower case letters");
		}
		else if((x>=48)&&(x<=57))
		{
			System.out.println("digits");
		}
		else
		{
			System.out.println("special symbols");
		}
		
	}
}