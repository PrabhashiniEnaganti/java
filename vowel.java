class vowel
{
	public static void main(String args[])
	{
		char a='g';
		if(a>=65 && a<=90)
		{
			if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
			{
				System.out.println("vowel");
			}
			else
			{
				System.out.println("consonant");
			}
		}
		else if(a>=97 && a<=122)
		{
			if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
			{
				System.out.println("vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
		}
		
	}
}