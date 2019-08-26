import java.util.*;
class Run{
	public static void main(String[] args) {
			Signal obj=new Signal();
			obj.getSignal();
			obj.Smooth_signal();
			obj.show();
	}
}
class Signal
{
	private int[] signal;
	private int[] smooth;
	private int N;
	public void getSignal()
	{
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		signal=new int[N];
		int i;
		for(i=0;i<N;i++)
		{
			signal[i]=sc.nextInt();
		}
	}
	public void Smooth_signal()
	{
		smooth=new int[N];
		smooth[0]=(signal[0]+signal[1])/2;
		for(int i=1;i<N-1;i++)
		{
			smooth[i]=(signal[i-1]+signal[i]+signal[i+1])/3;
		}
		smooth[N-1]=(signal[N-1]+signal[N-2])/2;
	}
	public void show()
	{
		System.out.println("Signal: "+Arrays.toString(signal));
		System.out.println("Smooth Signal: "+Arrays.toString(smooth));
	}

}