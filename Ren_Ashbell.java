import java.util.Arrays;
import java.util.Scanner;


public class Ren_Ashbell 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int nums = input.nextInt();
		int[] powers = new int[nums];
		boolean a = false;
		
		
		for(int i =0; i<nums; i++)
		{
			powers[i] = input.nextInt();
			a=false;
			if(powers[0]>powers[i])
			{
				a =true;
			}
		}
		if(a == true)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}

}
