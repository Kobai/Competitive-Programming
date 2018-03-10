import java.util.Scanner;


public class Logging {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numDay = input.nextInt();
		int numLog=0;
		int logs = 0;
		
		for(int i = 1; i<=numDay; i++)
		{
			numLog = input.nextInt();
			for(int j=0; j<numLog; j++)
			{
				logs+= input.nextInt();
			}
			if (logs ==0)
			{
				System.out.println("Weekend");
			}
			else
			{
			System.out.println("Day "+(i)+": "+logs);
			}
			logs = 0;
			
		}
	}

}
