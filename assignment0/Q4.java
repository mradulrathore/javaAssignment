import java.util.Scanner;
class Run{
	public static void main(String[] args) {
		Test obj=new Test();
		obj.getScores();
		obj.getAverage();
		obj.getHighest();
			
	}
}

class Test
{
	private float[] score=new float[5];
	public void getScores()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Test Scores:");
			int i;
			for(i=0;i<5;i++)
				{
					score[i]=sc.nextFloat();
					if(score[i]<0 || score[i]>100)
						{
							System.out.println("Invalid Test Score! Re-enter.");
							score[i]=sc.nextFloat();
						}
				}

		}
	public void getAverage()
		{
			int i=0;
			float tot=0;
			for(i=0;i<5;i++)
			{
				tot+=score[i];
			}
			System.out.println("Average: "+tot/5);
		}
	public void getHighest()
		{
			int i=0;
			float max=score[0];
			for(i=1;i<5;i++)
			{
				if(max<score[i])	max=score[i];
			}
			System.out.println("Highest Score: "+max);
		}
}
