class Powernum
{
	public static void main(String args[])
	{
		int n=172,sum=0,rem,mul=1;
		for(;n>0;n/=10)
		{
			rem=n%10;//2//4//1
			sum+=rem;//0+2//2+4//6+1//7
			mul*=rem;//1*2//2*4//8*1//8
		}
		if(sum==mul)//7!=8
			System.out.println("Power Number");
		else
			System.out.println("not a power number");
	}
}
			
		