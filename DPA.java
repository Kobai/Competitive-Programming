import java.util.Scanner;


public class DPA 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int a;
		int b;
		int c;
		
		for(int i = 0; i<num; i++)
		{
			a = input.nextInt();
			b = -a;
			c = (int)Math.round(Math.sqrt(a));
			
			for(int j = 1; j<=a; j++)
			{
				if(a%j==0) 
				{
					b+=j;  
				}
			}
			
			
			if(b>a)
			{
			System.out.println(a +" is an abundant number.");
			}
			else if(b<a)
			{
				System.out.println(a + " is a deficient number.");
			}
			else
			{
				System.out.println(a+" is a perfect number.");
			}
		}

		
	}

}

