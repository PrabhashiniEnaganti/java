class Insurance
{
	public static void main(String args[])
	{
		int age=30;
		double premium=0;
		String a="lives in village",gender="male",health="poor";
		if(age>=25 && age<=35 && gender=="male" && a=="lives in city" && health=="excellent")
		{
			premium=4/1000.0*200000;
		}
		else if(age>=25 && age<=35 && gender=="female" && a=="lives in city" && health=="excellent")
		{
			premium=3/1000.0*200000;
		}
		else if(age>=25 && age<=35 && gender=="male" && a=="lives in village" && health=="poor")
		{
			premium=6/1000.0*200000;
		}
		else
		{
			System.out.println("person is not insured");
		}
		System.out.println("premium: "+premium);
		
		
	}
}
		