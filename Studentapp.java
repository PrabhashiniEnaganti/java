class studentapp
{
	public static void main(String args[])
	{
		String name="saara",grade;
		int rollno=14;
		char section='A';
		int scholarship,donation,maxmarks=600,fee=80000;
		int s1=89,s2=67,s3=89,s4=79,s5=67,s6=78;
		int total=s1+s2+s3+s4+s5+s6;
		double percentage=(total/600.0)*100;
		if(percentage>75)
		{
			section='A';
			scholarship=10000;
			donation=0;
			grade="outstanding";
		}
		else
		{
			section='B';
			scholarship=0;
			donation=12000;
			grade="should improve";
		}
		fee=fee+donation-scholarship;
		System.out.println("total fee: "+fee);
		System.out.println("percentage: "+percentage);
		System.out.println("total"+total);
		System.out.println("grade: "+grade);
	}
}
		