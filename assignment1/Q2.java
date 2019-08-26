import java.util.*;
class Car{
	protected int speed;
	protected double regularPrice;
	protected String colour;
	public Car(int s,double rp,String col){
		
		speed=s;
		regularPrice=rp;
		colour=col;
	}
	public double getSalePrice()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sale Price");
		return sc.nextDouble();
	}
}
class Truck extends Car{
	private int weight;
	public double getSalePrice(){
		if(weight>2000)
		{
			return regularPrice*(1-10.0/100.0);
		}
		else
		{
			return regularPrice*(1-20.0/100.0);
		}
	}
}

class Ford extends Car{
	Scanner sc=new Scanner(System.in);
	private int year;
	private int manufacturerDiscount;
	public Ford()
	{
		
		super(100,800000,"Red");
	
		System.out.println("Enter the Year and Manufacturer Discount");
		year=sc.nextInt();
		manufacturerDiscount=sc.nextInt();
	}
	public double getSalePrice(){
		return super.getSalePrice()-manufacturerDiscount;
	}

}
class Sedan extends Car{
	Scanner sc=new Scanner(System.in);
	private int length;
	public Sedan()
	{	

		super(100,1000000,"White");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length of Sedan");
		length=sc.nextInt();
	}
	public double getSalePrice(){
		if(length>20)
		{
			return regularPrice*(1-5.0/100.0);
		}	
		else
		{
			return regularPrice*(1-10.0/100.0);
		}

	}
}

class MyOwnAutoShop{
	public static void main(String args[])
	{
		Sedan sd=new Sedan();
		System.out.println(sd.getSalePrice());
		Ford fd1=new Ford();
		System.out.println(fd1.getSalePrice());
		Ford fd2=new Ford();
		System.out.println(fd2.getSalePrice());
	}
}
