class unary
{
	public static void main(String args[])
	{
		int a=11,b;
		b=a++;//b=11
		System.out.println(a+"      "+b);//12      11
		System.out.println(a++ + ++a +a);//12+14+14//40
		System.out.println(b++ +a+ ++b);//11+14+13//38
	}
}