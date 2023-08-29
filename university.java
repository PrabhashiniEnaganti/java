class university
{
	public static void main(String args[])
	{
		int a=25,b=25;

		if(a>=55 && b>=45)
		{
			System.out.println("pass");
			
		}
		else if(a<55 && b>=55 && a>=45)
		{
			System.out.println("qualify");
		}
		else if(b<45 && a>=65)
		{
			System.out.println("reappear to exam");
		}
		else
		{
			System.out.println("pakka fail");
		}
	}
}

				

