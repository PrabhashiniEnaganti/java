class Iphone
{
	public static void main(String args[])
	{ 
		System.out.println("APPLE iPhone 14(Blue, 128GB)");
		System.out.println("Extra rs11901 off");
		int price=79900;
		System.out.println(price + "   14%off");
		double offer=price*14/100;
		System.out.println("offer price: " +offer);
		double finalprice=price-offer;
		System.out.println(" price: " +finalprice);
		System.out.println("+rs99 Secured Packaging fee");
		int packfee=99;
		double subfinal=finalprice+packfee;
		System.out.println(subfinal);
		double bankoffer=subfinal*5/100;
		double finall=subfinal-bankoffer;
		System.out.println(finall);
		int exchange=7000;
		double total=finall-exchange;
		System.out.println("total: " +total);
		int supercoins=2;
		double howmany=(supercoins*total)/100;
		System.out.println("no.of supercoins: " +howmany);
		System.out.println("after: " +(total-howmany));
		
	}
	
}
