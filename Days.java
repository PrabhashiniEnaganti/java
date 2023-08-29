class days
{
	public static void main(String args[])
	{
		String day="wednesday",activity="";
		if(day=="sunday")
		{
			activity="Movie";
		}
		else if(day=="monday")
		{
			activity="work";
		}
		else if(day=="tuesday")
		{
			activity="pray";
		}
		else if(day=="wednesday")
		{
			activity="play";
		}
		else if(day=="thursday")
		{
			activity="clean and wash";
		}
		else if(day=="friday")
		{
			activity="sleep";
		}
		else if(day=="saturday")
		{
			activity="shopping";
		}
		else
		{
			System.out.println("Enter proper day");
		}
		System.out.println("activity: "+activity);
	}
}
