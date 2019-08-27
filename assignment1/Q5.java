import java.util.Scanner;

class Employee{
	 protected String doj;
	 protected float salary;
	 protected float leaves;
	 public Employee(){
	 	System.out.println("Enter the Date of Joining and leaves taken per year");
	 	Scanner sc=new Scanner(System.in);
	 	doj=sc.nextLine();
	 	leaves=sc.nextFloat();
	 }

}
class Manager extends Employee{
	public Manager(){
		salary=1200000f;
	}
	 protected float L,Hike;
	
}
class HR extends Manager{
	public HR(){
		L=2.5f;
		Hike=0.2f;
		if(leaves<=L)
			{	salary+=Hike*salary;

			}
		System.out.println("Salary: "+salary/12);
	}

}
class Technology extends Manager{
	public Technology(){
		L=2.5f;
		Hike=0.3f;
		if(leaves<=L)
			{	salary+=Hike*salary;

			}
		System.out.println("Salary: "+salary/12);
	}	
}


class Engineer extends Employee{
	protected static float L,Hike;
}
class Developer extends Engineer{
	public Developer(){
		salary=1000000f;
		L=3f;
		Hike=0.1f;
		if(leaves<=L)
			{	salary+=Hike*salary;

			}
		System.out.println("Salary: "+salary/12);
	}
}
class Tester extends Engineer{
	public Tester(){
		salary=600000f;
		L=2.5f;
		Hike=0.1f;
		if(leaves<=L)
			{	salary+=Hike*salary;

			}
		System.out.println("Salary: "+salary/12);
}
}
class Architect extends Engineer{
	public Architect(){
		salary=1200000f;
		L=4f;
		Hike=0.5f;
		if(leaves<=L)
			{	salary+=Hike*salary;

			}
		System.out.println("Salary: "+salary/12);
	}
}

class Researcher extends Employee{
		public Researcher(){
			salary=1500000f;
		}
		protected static float L,Hike;
}
class DataScientist extends Researcher{
	public DataScientist(){
		L=4f;
		Hike=0.5f;
		if(leaves<=L)
			{	salary+=Hike*salary;

			}
		System.out.println("Salary: "+salary/12);
	}
}
class Analytics extends Researcher{
	public Analytics(){
		L=3f;
		Hike=0.4f;
		if(leaves<=L)
			{	salary+=Hike*salary;

			}
		System.out.println("Salary: "+salary/12);
	}
}
class Cloud extends Researcher{
	public Cloud(){
		L=3f;
		Hike=0.4f;	
		if(leaves<=L)
			{	salary+=Hike*salary;

			}
		System.out.println("Salary: "+salary/12);
	}

}

class Run{
	public static void main(String args[])
	{
		HR m_obj=new HR();
		

	}
}
