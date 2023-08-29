class rectangle
{
	public static void main(String args[])
	{
		int l=3,b=4;
		int area=l*b;
		int perimeter=2*(l+b);
		if(area>perimeter)
		{
			System.out.println("area is greater than its perimeter");
		
		}
		else
		{
			System.out.println("perimeter>area");
		}
	}
}