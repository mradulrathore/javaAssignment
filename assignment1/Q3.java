import java.lang.Math; 
import java.util.Scanner;

class Play{
	public static void main(String args[])
		{
			Guess obj=new Guess();
			obj.userGuess();
		}
}

class Guess{
	private int original_num;
	private int guess_num;
	public void userGuess()
	{
		int original_num=(int)(Math.random() * 1000) + 1;
		System.out.println("Enter Guess Number");
		Scanner sc=new Scanner(System.in);
		int flag=1;
		while(flag==1)
		{
			guess_num=sc.nextInt();
			if(guess_num<original_num)
			{
				System.out.println("Too Low, Try Again");
			}
			else if(guess_num>original_num)
			{
				System.out.println("Too High, Try Again");
			}
			else
			{
				System.out.println("Congratulations!");
				System.out.println("Want To Play Again?");
				char ch;
				ch=sc.next().charAt(0);
				if(ch=='y')
					userGuess();
				else
					System.exit(0);
			}
		}
	}
}
