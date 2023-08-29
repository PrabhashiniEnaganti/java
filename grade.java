class grade
{
	public static void main(String args[])
	{
		int hardness=60,textile=5700,grade=0;
		double carbon=0.7;
		if(hardness>50 && carbon<0.7 && textile>5600)
		{
			grade=10;
		}
		else if(hardness>50 && carbon<0.7)
		{
			grade=9;
		}
		else if(carbon<0.7 && textile>5600)
		{
			grade=8;
		}
		else if(hardness>50 && textile>5600)
		{
			grade=7;
		}
		else if(hardness>50 || carbon<0.7 || textile>5600)
		{
			grade=6;
		}
		else
		{
			grade=5;
		}
		System.out.println("grade: "+grade);
	}
}


			

