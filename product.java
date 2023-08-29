class Product
{
	public static void main(String args[])
	{
		String name="earpods";
		int prodcode=17;
		int price=1500;
		int quan=2;
		double total=price*quan,discount;
		System.out.println(total);
		if(total>2000)
		{
			discount=10.0/100*total;
		}
		else
		{
			discount=5.0/100*total;
		}
		System.out.println("after discount: "+(total-discount));
	}
}
			