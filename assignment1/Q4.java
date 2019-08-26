import java.util.*;
import java.lang.Math;

class Account{

	Scanner sc=new Scanner(System.in);
	protected String customer_name;
	protected String account_no;
	protected String type_account;
	protected float balance;
	protected Account()
	{
		System.out.println("Enter Your Name");
		customer_name=sc.nextLine();
		System.out.println("Enter Account Number");
		account_no=sc.nextLine();
	}
	protected void display()
	{
		System.out.println("Account No.: "+account_no+"\nCustomer Name: "+customer_name+"\nAccount Type: "+type_account+"\nBalance: "+balance);
	}

}

class cur_account extends Account
{

	private float init_bal;
	private float interest;
	Scanner sc=new Scanner(System.in);
	public cur_account()
	{	type_account= "Current Account";
		
		System.out.println("Enter the amount to be deposit");
		balance=sc.nextFloat();
		while(balance<1000)
			{
				System.out.println("Minimum Balance Required 1000");
				balance=sc.nextFloat();
			}
		init_bal=balance;

	}

	public void deposit()
	{
		System.out.println("Enter Amount To Deposit");
		balance+=sc.nextFloat();
	}
	public void withdraw()
	{
		check();
		System.out.println("Enter Amount To Withdraw");
		balance-=sc.nextFloat();
		simpleInterest();
		
	}
	public void simpleInterest()
	{
		System.out.println("Enter Time Period");
		float time=sc.nextFloat();
		interest=init_bal*0.05f*time;
		balance+=interest;
	}
	public void check()
	{
		while(balance<500)
			{
				System.out.println("Your account is blocked. Deposit Rs.500 to unlock it");
				deposit();
			}
		
		if(balance<1000)
			balance-=500;
	}
	public void display()
	{
		super.display();
		System.out.println("Simple Interest: "+interest);
	}

}

class sav_account extends Account
{
	
	private float interest;
	public sav_account()
	{
		type_account="Saving Account";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to be deposit");
		balance=sc.nextFloat();
	}
	public void deposit()
	{
		System.out.println("Enter Amount To Deposit");
		balance+=sc.nextFloat();
		
	}
	public void withdraw()
	{
		System.out.println("Enter Amount To Withdraw");
		balance-=sc.nextFloat();
		compoundInterest();
		
	}
	public void compoundInterest()
	{
		System.out.println("Enter Time Period");
		double time=sc.nextFloat();
		float temp=(float)Math.pow(1+0.05/2,2*time);
		interest=balance*(temp)-balance;
		balance+=interest;
	
	}

	public void display()
	{
		super.display();
		System.out.println("Compound Interest: "+interest);	
	}
}

class Run{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Type Of Account You Want To Open");
			String type_account=sc.nextLine();
			if(type_account.equals("Saving Account"))
				{
				
					sav_account obj =  new sav_account();
					
				
					while(1==1)
					{System.out.println("Enter\n1-Deposit\n2-Withdraw\n3-Display");
					int n;
					n=sc.nextInt();
						switch(n)
					{
						case 1:	obj.deposit();
								break;
						case 2:	obj.withdraw();
								break;
						case 3:	obj.display();
								break;
						default: System.exit(0);
					}}
				}
			else
				{
					cur_account obj=new cur_account();
			

					while(1==1)
					{
				System.out.println("Enter\n1-Deposit\n2-Withdraw\n3-Display");
					int n;
					n=sc.nextInt();
						switch(n)
					{
						case 1:	obj.deposit();
								break;
						case 2:	obj.withdraw();
								break;
						case 3:	obj.display();
								break;
						default: System.exit(0);
					}
				}
				}

		}

}