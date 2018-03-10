import java.util.Scanner;


public class Double_Dice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int rounds = input.nextInt();
		int a=100;
		int b =100;
		
		int[] aRoll = new int[rounds];
		int[] bRoll = new int[rounds];
		
		for(int i =0; i<rounds; i++)
		{
			aRoll[i]= input.nextInt();
			bRoll[i]= input.nextInt();
			if(aRoll[i]>bRoll[i])
			{
				b-= aRoll[i];
			}
			else if(bRoll[i]> aRoll[i])
			{
				a-= bRoll[i];
			}
		}
		System.out.println(a);
		System.out.println(b);
		

	}

}
