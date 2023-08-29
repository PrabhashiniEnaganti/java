class Empsalary
{
	public static void main(String args[]) 
	{
	int empid=5463;
	String empname="shcjksb";
	String empadd="8-6-654/b";
	int daysalary=1550;
	int empworkdays=26;
	int absentdays=5;
	int total_workdays=empworkdays-absentdays;
	System.out.println(total_workdays);
	int salary=daysalary*empworkdays;
	System.out.println(salary);
	int absentdays_salary=daysalary*absentdays;
	int finalempsalary=salary-absentdays_salary;
	System.out.println("salary after leaves: " +finalempsalary);
	}
}