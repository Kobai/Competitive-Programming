import java.util.Scanner;


public class Penny_Ring 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		while(x!=0)
		{
			int mid = 2*x+1;
			int right = 0;
			for(int i = 1; i<x; i++)
			{
				int j = (int)Math.sqrt(x*x- i*i);
				j = 2*j+1;
				right+=j;
			}
			right++;
			int total = 2*right + mid;
			System.out.println(total);
			x = sc.nextInt();
		}
		
	}
}
