import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] x = {'A','B','C','D','E'};
		char temp;
		int a=input.nextInt();
		int b=input.nextInt();
		
		while(a!=4)
		{
			switch(a)
			{
			case 1:
				for(int i = 0; i<b; i++)
				{
					temp = x[0];
					for(int j = 0; j<4; j++)
					{
						x[j]=x[j+1];
					}
					x[4]=temp;
				}
				break;
				
			case 2:
				for(int i = 0; i<b; i++)
				{
					temp = x[4];
					for(int j = 4; j>0; j--)
					{
						x[j]=x[j-1];
					}
					x[0]=temp;
				}
				break;
				
			case 3:
				for(int i = 0; i<b; i++)
				{
					temp = x[0];
					x[0] = x[1];
					x[1]=temp;
				}
				break;
			}
			 a=input.nextInt();
			 b=input.nextInt();
		}
		for(int i =0; i<5; i++)
			System.out.print(x[i]+" ");
		
		
		
	}

}
