import java.util.Scanner;



public class NextPrime 
{
	
	

	
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int x = input.nextInt();;

		if (x == 1)
		{
			System.out.println("2");
		} 
		
		else
		{
			
			while (!(prime(x))) 
			{
				x++;
			}

			System.out.println(x);

		}

	}
	public static boolean prime(int a)
	{

	    for(int i=2;i<Math.sqrt(a);i++) 
	    {

	        if(a%i==0)
	        {
	            return false;
	        }
	    }
	    return true;
	}

}