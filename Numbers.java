class numbers
{
	public static void main(String args[])
	{
		int a=40,b=20,c=30;
		if(a<b)  //40<20 //false
		{
			if(a<c)   //40<30 //false
			{
				System.out.println(a);
			}
		}
		else
		{
			if(a>b)  //40>20 //true
			{
				a=a+b;//40+20=60
				b=a-b;//60-20=40
				a=a-b;//60-40=20
			}
			if(a>c)	//40>30 //false
			{
				a=a+c;//40+30=70
				c=a-c;//70-30=40
				a=a-c;//70-40=30
			}
		}
		if(b>c)
		{
			b=b+c;//20+30=50
			c=b-c;//50-30=20
			b=b-c;//50-20=30
		}
		System.out.println("a: "+a+"\n"+"b: "+b+"\n"+"c: "+c);

		
		
	}
}
			
			