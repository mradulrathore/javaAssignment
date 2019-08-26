import java.util.Scanner;
class Calculator{
	public static void main(String args[])
		{
			Operation obj= new Operation();
			obj.getOperands();
			obj.getOperation();
		}
}
class Operation{
	private float a;
	private float b;
	public void getOperands()
		{
			System.out.println("Enter Operands:");
			Scanner in=new Scanner(System.in);
			a=in.nextFloat();
			b=in.nextFloat();
		}
	public void getOperation()
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter Operation To Perform:");
		ch=sc.next().charAt(0);
		switch(ch)
			{
				case '+': add(a,b);
						break;

				case '-': subtract(a,b);
						break;

				case '*': multiply(a,b);
						break;

				case '/': divide(a,b);
						break;
				default: System.exit(0);

			}
		getOperands();
		getOperation();
	}
	public void add(float a,float b)
	{
		System.out.println("Addition: "+(a+b));		
	}

	public void subtract(float a,float b)
	{
		System.out.println("Subtraction: "+(a-b));
	}

	public void multiply(float a,float b)
	{
		System.out.println("Multiplication: "+(a*b));
	}

	public void divide(float a,float b)
	{
		if(b!=0)
			System.out.println("Division: "+(a/b));
		else
			System.out.println("Invalid");
	}
	
}