import java.util.Scanner;


public class Vote_Count {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vote = input.nextInt();
		String votes= input.next();
		int a = 0;
		int b = 0;
		
		
		if (votes.length() > vote) 
		{
			votes = votes.substring(0, vote);
		}
		for(int i = 0; i<vote; i++)
		{
			if (votes.charAt(i)=='A') 
			{
				a++;
			}
			else if(votes.charAt(i)=='B')
			{
				b++;
			}
		}
		if(a==b)
		{
			System.out.println("Tie");
		}
		else if (a>b)
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("B");
		}
	}
}
		