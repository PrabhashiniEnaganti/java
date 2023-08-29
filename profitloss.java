class profitloss
{
	public static void main(String args[])
	{
		int sp=1000,cp=8000;
		int profit=sp-cp;
		int loss=cp-sp;
		if(sp>cp)
		{
			System.out.println(profit+"   profit");
		}
		else
		{
			System.out.println(loss+"   loss incured");
		}
	}
}