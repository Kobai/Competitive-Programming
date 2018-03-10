import java.util.Arrays;
import java.util.Scanner;


public class SawMill 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		Integer[] saws = new Integer[num];
		Integer[] logs = new Integer[num];
		long total = 0;
	
		
		
		for(int i = 0; i<num; i++)
		{
			saws[i] = input.nextInt();
		}
		Arrays.sort(saws);
		
		
		for(int i = 0; i<num; i++)
		{
			logs[i] = input.nextInt();
		}
		Arrays.sort(logs);
		
		
		for(int i = 0; i<num; i++)
		{
			total+= saws[i] * logs[num-1-i];
		}
		
		
		System.out.println(total);

	}

}
