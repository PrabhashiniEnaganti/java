class Myage
{
	public static void main(String args[])
	{
		int yrob=2001;
		int currentyr=2023;
		int age=currentyr-yrob;
		System.out.println("myage is: " +age);
		int months=12*age;
		int days=365*age;
		int hrs=24*days;
		int min=60*hrs;
		int sec=60*min;
		System.out.println("no.of months: " +months);
		System.out.println("no.of days: " +days);
		System.out.println("no.of hours: " +hrs);
		System.out.println("no.of minutes: " +min);
		System.out.println("no.of seconds: " +sec);
		
	}
}