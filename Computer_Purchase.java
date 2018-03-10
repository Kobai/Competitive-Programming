
import java.util.Scanner;


public class Computer_Purchase 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String name[] = new String[x];
		int specs[] = new int[x];
		int winLoc =0;
		int win = 0;
		int secP = 0;
		
		
		for(int i = 0; i<x; i++)
		{
			name[i] = sc.next();
			int r = sc.nextInt()*2;
			int c = sc.nextInt()*3;
			int d = sc.nextInt();
			specs[i]=r+c+d;
		}
		for(int i=0; i<x; i++)
		{
			if(specs[i]>win)
			{
				winLoc = i;
				win = specs[i];
			}
		}
		System.out.println(name[winLoc]);
	}

}
