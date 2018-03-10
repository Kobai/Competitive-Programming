import java.util.Scanner;


public class Main2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String a = input.nextLine();
		int happy = 0;
		int sad = 0;
	
		if(a.length()>=3)
		{
		for(int i = 0; i<a.length(); i++)
		{
			if(a.charAt(i)==':')
			{
				if(a.charAt(i+1)=='-')
				{
					if(a.charAt(i+2)==')')
					{
						happy++;
					}
					else if(a.charAt(i+2)=='(')
					{
						sad++;
					}
				}
			}
		}
		}
		
		if(happy>sad)
		{
			System.out.println("happy");
		}
		else if(sad>happy)
		{
			System.out.println("sad");
		}
		else if(sad==happy&&sad>0)
		{
			System.out.println("unsure");
		}
		else
		{
			System.out.println("none");
		}


	}

}
