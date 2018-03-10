import java.util.Scanner;


public class Eng_Fr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int t = 0;
		int s = 0;
		for(int i = 0; i<x; i++)
		{
			String cheese = sc.nextLine().toUpperCase();
			for(int j = 0; j<cheese.length(); j++)
			{
				char c = cheese.charAt(j);
				if(c=='T')
					t++;
				else if(c=='S')
					s++;
			}
			
		}
		if(t>=s)
			System.out.println("English");
		else
			System.out.println("French");

	}

}
