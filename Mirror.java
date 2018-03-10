import java.util.Scanner;


public class Mirror 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int a;
		int b;
		int p = 0;
		
		for(int i = 0; i<num; i++)
		{
			a = input.nextInt();
			b = input.nextInt();
			for(int j = a; j<b; j++)
			{
				if (j==2||j==3||j==5||j==7)
				{
					p++;
				}
				else if((j%2 !=0 && j%3 !=0 && j%5 !=0 && j%7 !=0)&&j>1 )
				{
					p++;
				}
				
			}
			System.out.println(p);
			p = 0;
			
		}
		

	}

}
