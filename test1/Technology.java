class Technology
{
	public static void main(String args[])
	{
		int n=1312,rem,sum=0,temp=n;
		for(;n>0;n/=100)//20/100
		{
			
			rem=n%100;//25//20
			sum+=rem;//0+25//25+20//45
		}
		int sqr=sum*sum;//45*45
		if(temp==sqr)
		{
			System.out.println("Technology number");
		}
		else
		{
			System.out.println("Not technology");
		}
	}
}
		