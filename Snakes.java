import java.util.Scanner;


public class Snakes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int square = 1;
		int move =0;
		
		while(square != 100)
		{
			move = input.nextInt();
			if(move == 0)
			{
				System.out.println("You Quit!");
				break;
			}
			
			if(square+move>100)
			{
				System.out.println("You are now on square "+square);
			}
			
			else
			{
			square+= move;
			
			if(square==9)
			{
				square = 34;
			}
			else if(square==40)
			{
				square = 64;
			}
			else if(square==67)
			{
				square = 86;
			}
			
			else if(square==54)
			{
				square = 19;
			}
			else if(square==90)
			{
				square = 48;
			}
			else if(square==99)
			{
				square = 77;
			}
			
			System.out.println("You are now on square "+square);
			}
			
		}
		if(square == 100)
		{
			System.out.println("You Win!");	
		}
		
		
	}

}
