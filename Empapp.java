class Empapp
{
	public static void main(String args[])
	{
		String empname="nithin";
		int empid=56;
		int basic_sal=50000;
		double ta=15,da=12,hra=19;
		double pf,tax,gross_sal;
		ta=15/100*basic_sal;
		da=12/100*basic_sal;
		hra=19/100*basic_sal;
		double- total_sal=basic_sal+ta+da+hra;
		System.out.println("initial total salary: "+total_sal);
		if(total_sal>40000)
		{
			pf=11;
			tax=5;
		}
		else
		{
			pf=7;
			tax=2.5;
		}
		pf=pf/100*basic_sal;
		tax=tax/100*basic_sal;
		gross_sal=total_sal-tax-pf;
		System.out.println("monthly salary: "+gross_sal);
		System.out.println("yearly salary: "+(gross_sal*12));
	}
}
			