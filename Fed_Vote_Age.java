import java.util.Scanner;


public class Fed_Vote_Age 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int[] year = new int[num];
		int[] month = new int[num];
		int[] day = new int[num];
		boolean a = false;
		
		
		for (int i=0; i<num; i++)
		{
			year[i]= input.nextInt();
			month[i]= input.nextInt();
			day[i]= input.nextInt();
			
			if(year[i]<1989)
			{
				a = true;
			}
			
			else if(year[i]==1989)
			{
				if(month[i]< 2)
				{
					a = true;
				}
				
				else if(month[i]==2)
				{
					if(day[i] <=27)
					{
						a = true;
					}
			
				}
				
				
			}
			if (a)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");	
			}
			a = false;
			
			
		
		}
		
				

	}

}
