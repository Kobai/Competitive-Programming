import java.util.Arrays;
import java.util.Scanner;

public class Ragaman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstString = sc.next();
		String secondString = sc.next();
		int unMatch = 0;
		int wildNum =0;
		int counter = 0;
		
		char[] firstChars =  firstString.toCharArray();
		char[] secondChars = secondString.toCharArray();
		
		Arrays.sort(firstChars);
		Arrays.sort(secondChars);
		
		for(int i = 0; i<secondChars.length; i++)
		{
			if(secondChars[0]=='*')
			{
				for(int j=0; j<secondChars.length-1; j++)
				{
					secondChars[j]=secondChars[j+1];
				}
				secondChars[secondChars.length-1]='*';
				wildNum++;
			}
		}
		
		for(int i = 0; i<firstChars.length; i++)
		{
			if(firstChars[i] != secondChars[counter])
				unMatch++;
			else
				counter++;
		}
		
		if(wildNum==unMatch)
			System.out.println("A");
		else
			System.out.println("N");
		
		
	}

}
