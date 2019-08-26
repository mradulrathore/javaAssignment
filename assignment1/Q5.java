import java.util.Scanner;

class Employee{
	 protected String doj;
	 protected float salary;

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
	}

}
class Technology extends Manager{
	public Technology(){
		L=2.5f;
		Hike=0.3f;
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
	}
}
class Tester extends Engineer{
	public Tester(){
		salary=600000f;
		L=2.5f;
		Hike=0.1f
}
}
	
class Architect extends Engineer{
	public Architect(){
		salary=1200000f;
		L=4f;
		Hike=0.5f;
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
	}
}
class Analytics extends Researcher{
	public Analytics(){
		L=3f;
		Hike=0.4f;
	}
}
class Cloud extends Researcher{
	public Cloud(){
		L=3f;
		Hike=0.4f;	
	}
}

class Run{
	public static void main(String args[])
	{

	}
}