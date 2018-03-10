import java.util.Scanner;


public class Not_Enough_Users 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int dayZero=input.nextInt();
		int mult=input.nextInt();
		int dayX = input.nextInt();
		int dayXUser =dayZero;
		
		for(int i= 0; i<dayX; i++)
		{
			dayXUser*=mult;
		}
		System.out.println(dayXUser);
		
	}

}
