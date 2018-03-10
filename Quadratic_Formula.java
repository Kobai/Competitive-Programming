import java.util.Scanner;


public class Quadratic_Formula
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		String x;
		
		System.out.println("Solve equation? y/n");
		x = input.next();
		
		while(x.equals("y"))
		{
			System.out.println("a:");
			a = input.nextDouble();
			System.out.println("b:");
			b = input.nextDouble();
			System.out.println("c:");
			c = input.nextDouble();
			
			if(a ==0)
			{
				System.out.println("r1: "+ -c/b);
			}
	
			double discrim = b*b - 4*a*c;
			
			
			if(discrim<0)
			{
				double r = -b / (2*a);
				double i = Math.sqrt(-(b*b-4*a*c)) / (2*a);
				System.out.println("r1: real: "+ r + " imaginary: "+i);
				System.out.println("r2: real: "+ r + " imaginary: "+(-i));
			}
			else
			{
			double r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
			double r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
			
			System.out.println("r1: "+ r1);
			if(r1 != r2)
			{
			System.out.println("r2: "+ r2);
			}
			}
			
			System.out.println("Solve equation? y/n");
			x = input.next();
		}
		
		
		
		
	}

}
