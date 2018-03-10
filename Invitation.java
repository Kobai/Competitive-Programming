import java.util.Scanner;


public class Invitation 
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		String a = input.nextLine();
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++)
		{
			String name = input.next();
			System.out.println(a.replace(">", name));
		}
		
		

	}

}
