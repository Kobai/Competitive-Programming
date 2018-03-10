import java.util.Arrays;
import java.util.Scanner;


public class Median_Mark
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int [] mark = new int [num];
		
		for (int i = 0; i < num; i++)
		{
			mark[i] = input.nextInt();
		}
		
		Arrays.sort(mark);
		
		System.out.println(mark[num/2]);
		
		
	}
	
}