import java.util.Scanner;


public class GermanNouns 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		input.next();
		String x;
		int UpperCase = 0;
		
		for(int i = 0; i<num; i++)
		{
			x = input.nextLine();
			for(int j = 0; j<x.length(); j++)
			{
				if(x.charAt(j)>='A'&& x.charAt(j)<='Z')
				{
					UpperCase++;
				}
			}
			System.out.println(UpperCase);
			UpperCase = 0;
		}
		

	}

}
