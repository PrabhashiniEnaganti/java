//if x%y==0 then x and y values must be swapped else print x and y as it is
class Swapping
{
	public static void main(String args[])
	{
		int x=50,y=10;
		if(x%y==0)
		{
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println(x+"    "+y);
		}
		System.out.println(x);
		System.out.println(y);
	}
	
		
}