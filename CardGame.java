import java.util.Scanner;


public class CardGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int[] b = new int[a];
		int young = 0;
		int players=a;
		
		for(int i=0; i<a; i++)
		{
			b[i]=input.nextInt();
			if(b[i]<0)
			{
				players--;
			}
			else if(b[i]<12)
			{
				players--;
				young++;
			}
			
		}
		if(young == 1)
		{
			System.out.println("1 person is too young to play.");
		}
		else if(young>1)
		{
			System.out.println(young +" people are too young to play.");
		}
		if(players >12)
		{
			System.out.println("There are too many people who want to play.");
		}
		else if(players<12)
		{
			System.out.println("There are not enough people to play.");
		}
		else
		{
			System.out.println("Time to play!");
		}
		

	}

}
