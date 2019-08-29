import java.util.Scanner;

class DateTest{
	public static void main(String args[])
	{
		Date obj=new Date(12,0,2000);
		obj.get();
		obj.displayDate();
	}
}

class Date{
	private int month;
	private int day;
	private int year;
	public Date(int month, int day, int year)
	{
		this.month=month;
		this.day=day;
		this.year=year;
	}
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Month: ");
		int month=sc.nextInt();
		System.out.println("Day: ");
		int day=sc.nextInt();
		System.out.println("Year: ");
		int year=sc.nextInt();
		set(month,day,year);
	}
	public void set(int month,int day, int year)
	{
		this.month=month;
		this.day=day;
		this.year=year;
	}
	public void displayDate()
	{
		String date=month+"/"+day+"/"+year;
		System.out.println(date);
	}
}