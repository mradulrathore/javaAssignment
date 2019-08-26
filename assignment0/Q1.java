import java.util.Scanner;
class PointLocation{
	private double x,y;

	public int quadrants(double a,double b)
		{
			if((a==0) && (b==0))
					return 0;
			else if(a==0)
					return -2;
			else if(b==0)
					return -1;
			else if((a>0)&&(b>0))
					return 1;
			else if((a<0)&&(b>0))
					return 2;
			else if((a<0)&&(b<0))
					return 3;
			else 
					return 4;
		}

}

class Q1{

	public static void main(String args[])
		{
			PointLocation obj=new PointLocation();
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Coordinates:");
			double x=in.nextDouble();
			double y=in.nextDouble();
			System.out.println(obj.quadrants(x,y));
		}
}
