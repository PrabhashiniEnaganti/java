class Onlinetickets
{
	public static void main(String args[])

	{
		String theatre_name="PVR Cinemas";
		System.out.println("Theatre name: " +theatre_name);
		String movie_name="Mr.Pregnant";
		System.out.println("Movie name : " +movie_name);
		String lang="Telugu";
		String date="20-august";
		String time="6pm";
		int no_of_tickets=4;
		System.out.println("Quantity: "  +no_of_tickets); 
		int tic_price=300;
		int price=tic_price*no_of_tickets;
		System.out.println("actual price: " +price);
		int glases_3D=30;
		int after3d=glases_3D*no_of_tickets;
		double after=price+after3d;
		System.out.println("after 3D charge: " +after);
		double fest_coupon=5*after/100;
		System.out.println("festival offer is 5%: "+fest_coupon);
		double now=after-fest_coupon;
		System.out.println("afterr coupon applied: " +now);
		int gst=15;
		System.out.println("gst added: " +gst);
		double final_price=now+gst;
		System.out.println("final ticket price: " +final_price);
		System.out.println("tic_price-----glases_3D cost-----festival_offer5%-----------gst------------final price");
		System.out.println();
		System.out.print("    "+tic_price);
		System.out.print("                 "+glases_3D);
		System.out.print("                 "+fest_coupon);
		System.out.print("                 " +gst);
		System.out.print("               "+final_price);

		
		
	}
}