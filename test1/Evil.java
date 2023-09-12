class Evil
{
	public static void main(String args[])
	{
		int n=9,sqr,rem,sum=0;
		sqr=n*n;//9*9//81
		System.out.println("square of that number:  "+sqr);
		for(;sqr>0;sqr/=10)
		{
			rem=sqr%10;//1//8
			sum+=rem;//0+1//1//1+8//9
		}
		if(n==sum)//9==9
			System.out.println("Evil Number");
		else
			System.out.println("not an Evil number");
	}
}
		
		
		
	