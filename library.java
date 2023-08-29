class library
{
	public static void main(String args[])
	{
		int days=3,fine=0;
		if(days<=50)
		{
			fine=50;
		}
		else if(days>=9)
		{
			fine=1;
		}
		else if(days>10)
		{
			fine=5;
		}
		else 
		{
			System.out.println("membership is removed");
		}
		System.out.println("fine :"+fine);
	}
}



		