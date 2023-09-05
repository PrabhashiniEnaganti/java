//forward iteration i.e without including number in iterations
class prime2
{
	public static void main(String args[])
	{
		int num=10,i=2,end=num,temp=0;
		while(i<num)
		{
			if(end%i==0)
			{
				temp++;
			}
			i++;
		}
		if(temp==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
}
				