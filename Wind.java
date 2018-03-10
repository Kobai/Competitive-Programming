import java.util.Scanner;


public class Wind {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int humid = input.nextInt();
		int maxTime = input.nextInt();
		double a = 0;
		
		for (int i = 1; i <= maxTime; i++)
		{

			a = -6*Math.pow(i,4) +humid*Math.pow(i,3)+ 2*Math.pow(i,2) +i;

			if (a <= 0)
			{
				System.out.println("The balloon first touches ground at hour: \n"+ i);
				break;
			}

		}
		

		for (int i = 0; i < 1; i++)
		{
			if (a <= 0)
				System.out.println("");
			else
				System.out.println("The balloon does not touch ground in the given time.");
		}
	}

}