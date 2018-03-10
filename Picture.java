import java.util.Scanner;


public class Picture
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		
		int num = input.nextInt();
		int dA;
		int dB;
		
		
		while(num!=0)
		{
			if(Math.pow((int)Math.sqrt(num),2) == num)
			{
				dA = (int)Math.sqrt(num);
				dB = (int)Math.sqrt(num);
				
				System.out.println("Minimum perimeter is "+ dA*4+" with dimensions "+ dA+" x "+dB);
			}
			else
			{
				dA = (int)Math.sqrt(num);
				dB = (int)Math.sqrt(num)+2;
				System.out.println("Minimum perimeter is "+ (dA*2 + dB*2) +" with dimensions "+ dA+" x "+dB);
			}
			
			num = input.nextInt();
		}
		
		
		
		
	}

}
