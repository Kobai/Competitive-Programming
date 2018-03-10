import java.util.Scanner;


public class FoodSelection 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int cL = input.nextInt();
		int cF = input.nextInt();
		int cS = input.nextInt();
		int dish = input.nextInt();
		int serve;
		int[] iL = new int[dish];
		int[] iF = new int[dish];
		int[] iS = new int[dish];
		String[] name = new String[dish];
		
		for(int i = 0; i<dish; i++)
		{
			serve = input.nextInt();
			iL[i]= (int) Math.ceil(input.nextInt()/(serve*1.0));
			iF[i]= (int) Math.ceil(input.nextInt()/(serve*1.0));
			iS[i]= (int) Math.ceil(input.nextInt()/(serve*1.0));
			name[i]= input.nextLine();
		}
		
		for(int i =0; i<dish; i++)
		{
			if(iL[i] <= cL &&iF[i] <= cF &&iS[i] <= cS)
			{
				System.out.println(name[i]);
			}
		}
		
		
	}

}
