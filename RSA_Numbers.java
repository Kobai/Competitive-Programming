import java.util.Scanner;


public class RSA_Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = 0;
		int d = 0;
		
		for(int i = a; i<=b; i++)
		{
			
			for(int j=1; j<= i; j++)
			{
			 	if(i/j== i*1.0/j)
			 	{
			 		c++;
			 	}
			}
			if(c==4)
			{
				d++;
			}
			c=0;
		
		}
		System.out.println("The number of RSA numbers between " + a +" and "+ b +" is "+d);
	

	}

}
