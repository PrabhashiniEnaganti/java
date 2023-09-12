class Armstrong
{
	public static void main(String args[])
	{
		int n=1634,rem,n1=n,temp=0,n2=n;
		
		System.out.println("count:  "+count);
		for(;n1!=0;n1/=10)
		{
			count++;
			rem=n1%10;//3//5//1
			temp=temp+(rem*rem*rem*rem);
			
		}
		if(n2==temp)
			System.out.println("Armstrong number");
		else
			System.out.println("not Armstrong");
	}
}
			
		
		