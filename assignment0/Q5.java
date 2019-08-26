import java.util.Scanner;
class Run{
	public static void main(String[] args) {
		Player obj=new Player();
		obj.edit("Ajay",101.3f,"India");
		obj.showDetails();
			
	}
}

class Player{
	private String name;
	private float average;
	private String team;
	public Player()
	{
		System.out.println("Enter Player Name, Average and Team Name:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		average=sc.nextFloat();
		sc.next();
		team=sc.nextLine();
	}
	public void showDetails()
	{
		System.out.println("Player Name: "+name+"\nAverage: "+average+"\nTeam Name: "+team);	
	}
	public void edit(String nm,float avg,String tm)
	{
		name=nm;
		average=avg;
		team=tm;
	}

}
