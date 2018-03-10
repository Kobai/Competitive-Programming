import java.util.Scanner;


public class English_Or_French 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		String[] line = new String[num+1];
		int t = 0;
		int s = 0;
		
		for (int i = 0; i<num+1; i++)
		{
			line[i] = input.nextLine();
			
			for (int j=0; j<line[i].length(); j++)
			{
				if(line[i].charAt(j) == 'T' || line[i].charAt(j)=='t')
				{
					t++; 
				}
				else if(line[i].charAt(j) == 'S' || line[i].charAt(j)=='s')
				{
					s++;
				}
			}
		}
		if (t>s)
		{
			System.out.println("English");
		}
		else
		{
			System.out.println("French");
		}
		
	}
}
