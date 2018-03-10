import java.util.Scanner;

public class A_Plus_B 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int numProblems = input.nextInt();
		int[] numbers = new int[numProblems*2];

		
		
		for (int i = 0; i < numProblems*2; i++)
		{
			numbers[i] = input.nextInt();
		}
		
		for(int j=0;j<numProblems*2; j++)
		{
			System.out.println(numbers[j] + numbers[++j]);
		}

	}
}
