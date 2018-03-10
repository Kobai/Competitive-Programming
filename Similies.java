import java.util.Scanner;


public class Similies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int adjectives = input.nextInt();
		int nouns = input.nextInt();
	
		String[] adjectiveList = new String[adjectives];
		String[] nounList = new String[nouns];
		
		for(int i = 0; i<adjectives; i++)
		{
			adjectiveList[i]=input.next();
		}
		for(int i =0; i<nouns; i++)
		{
			nounList[i]=input.next();
		}
		
		for(int i=0; i<adjectives; i++)
		{
			
			for(int j=0; j<nouns; j++)
			{
			
				System.out.println(adjectiveList[i] + " as " + nounList[j]);
			
			
			}
			
		}

	}

}
