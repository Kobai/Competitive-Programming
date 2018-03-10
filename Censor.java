import java.util.Scanner;


public class Censor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String word;
		
		for(int i = 0; i<=num; i++)
		{
			String[]words = input.nextLine().split(" ");
		
			for(int j = 0; j<words.length; j++)
			{
				word = words[j];
				
				if(word.length()==4)
				{
					word="****";
				}
				
				System.out.print(word);
				
				if(j+1 != words.length)
				{
					System.out.print(" ");
				}
				
			}
				System.out.println();
		
		}
		

	}

}
