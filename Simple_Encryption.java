import java.util.Scanner;


public class Simple_Encryption {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String code = input.nextLine();
		
		String message = input.nextLine();
		
		
		char[] change = new char[code.length()];
		char[] word = new char[message.length()];
		int x=0;
		int y =0;
		int z = -1;
		
		
		
		for(int i = 0; i<message.length(); i++)
		{
			if(message.charAt(i)>='A'&&message.charAt(i)<='Z')
			{
				
				word[x] = message.charAt(i);
				x++;
			}
		}
		
		for(int j=0; j<code.length(); j++)
		{
			change[j] = code.charAt(j);
		}
		
		for(int k = 0; k<code.length(); k++)
		{
			z++;
			if(k+1 == code.length())
			{
				k=0;
				y++;
			}
			
				word[z]+=change[k]-65;
			
			if(x+1 == y*code.length()+k)
			{
				break;
			}
		}

		for(int l=0; l<x; l++)
		{
			System.out.print(word[l]);
		}
	}

}
