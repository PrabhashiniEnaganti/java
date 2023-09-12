class Alien
{
	public static void main(String args[])
	{
		int n=14,sqr,rev=0,rem,sqr1,rem1,rev1=0;
		sqr=n*n;//144
		int n1=n;
		System.out.println("square of number:  "+sqr);
		for(;n>0;n/=10)
		{
			rem=n%10;//2//1
			rev=rev*10+rem;//2//21
		}
		sqr1=rev*rev;//21*21//441
		System.out.println("square of reversed number:  "+sqr1);
		for(;sqr>0;sqr/=10)
		{
			rem1=sqr%10;//4//4//1
			rev1=rev1*10+rem1;//441
		}
		n=n1;
		System.out.println("reverse of square num:  "+rev1);
		if(rev1==sqr1)
			System.out.println(n+"  is Alien number");
		else
			System.out.println(n+"  is not Alien number");
	}
}