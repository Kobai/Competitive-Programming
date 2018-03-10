import java.util.Scanner;


public class Boxes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int wa[] = new int[a]; 	
		int ha[] = new int[a]; 
		int la[] = new int[a]; 
		
		for(int i = 0; i<a; i++)
		{
			wa[i]= sc.nextInt();
			ha[i]= sc.nextInt();
			la[i]= sc.nextInt();
		}
		
		int b = sc.nextInt();
		int wb[] = new int[b]; 	
		int hb[] = new int[b]; 
		int lb[] = new int[b]; 
		int x=1000;
		
		for(int i = 0; i<b; i++)
		{
			wb[i]= sc.nextInt();
			hb[i]= sc.nextInt();
			lb[i]= sc.nextInt();
			for(int j = 0; j<a; j++)
			{
				
				if(wb[i]<=wa[j]&&hb[i]<=ha[j]&&lb[i]<=la[j])
				{
					if(wa[j]*ha[j]*la[j]<x)
						x=wa[j]*ha[j]*la[j];
				}
			}
			if(x<1000)
				System.out.println(x);
			else
				System.out.println("Item does not fit.");
			x=1000;
		}
		

	}

}
