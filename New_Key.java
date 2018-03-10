import java.util.Scanner;


public class New_Key {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String message = input.next();
		char[] letters = new char[message.length()];
		
		for(int i = 0; i<message.length();i++)
		{
			
			letters[i] = message.charAt(i);
			
			if(letters[i]=='0')
			{
				letters[i] = '9';
			}
			else if(letters[i]<'A'&&letters[i]>0)
			{
				letters[i]+=16;
			}
			else if(letters[i]<='J'&&letters[i]>='A')
			{
				letters[i]+=9;
			}
			else if(letters[i]<='P'&&letters[i]>='K')
			{
				letters[i]+=10;
			}
			System.out.print(letters[i]);
		}

	}

}
