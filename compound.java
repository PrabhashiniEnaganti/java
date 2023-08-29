class Compound	
{
	public static void main(String args[])
	{
		double p=1000,r=35,t=6;
		double A=p*(Math.pow((1+r/100),t));
		double ci=A-p;
		System.out.println(A+"\n"+ci);
	}
}
		
	