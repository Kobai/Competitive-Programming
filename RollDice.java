import java.util.Scanner;


public class RollDice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = 0;
		
		for(int i = 1; i<=a; i++)
		{
			for(int j = 1; j<=b; j++)
			{
				if(i+j == 10)
					c++;
			}
		}
		if(c==1)
			System.out.println("There is 1 way to get the sum 10.");
		else
			System.out.println("There are "+c+" ways to get the sum 10.");
	}

}
