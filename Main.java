import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c;
		int list[] = new int[a];
		
		for(int i = 1; i<=a; i++)
		{
			list[i-1] = i;
		}
		int x = 1;
		for(int i = 0; i<b; i++)
		{
			c=sc.nextInt();	
			
			for(int j = 1; j<a; j++)
			{
				if(list[j] !=0)
				{
					if(x!=c)
						x++;
					else
					{
						list[j]=0;
						x=1;
					}
				}
	
			}
		}
		
		for(int i = 0; i<a; i++)
		{
			if(list[i]!=0)
				System.out.println(list[i]);
		}
		
		
		
		

	}

}
