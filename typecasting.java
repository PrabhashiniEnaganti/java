class typecasting
{
	public static void main(String args[])
	{
		int a=6;
		char b;
		b=(char)(a);       //int to char
		System.out.println(b);
		float c=7.1f;
		int d=4;
		c=c+d;             //int to float
		System.out.println(c);
		d=(int)(c+d);          //float to int
		System.out.println(d);
		int z=3;
		double y=23.5;
		z=(int)(y);           //double to int
		System.out.println(z);
		y=z+y;               //int to double
		System.out.println(y);
		double f=6.7;
		float u=5.4f;
		u=(float)(f);          //double to float
		f=u+f;                  //float to double
		System.out.println(f);
		System.out.println(u);
		byte e=1;
		short s=7;
		s=(short)(e+s);           //byte to short 
		System.out.println(s);
		e=(byte)(s-e);           //short to byte
		System.out.println(e);
		int x=129;
		byte b1;
		b1=(byte)(x);
		System.out.println(b1);
		
		
		

	
	}
}
		
	