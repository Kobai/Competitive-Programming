import java.util.Scanner;


public class Fraction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numA = input.nextInt();
		int numB = input.nextInt();
		double numerator =0;
		double denominator = 0;
		
		if (numA/numB > 0)
		{
		System.out.print(numA/numB + " ");
		}
		
		if (numA%numB > 0 || numB%numA > 0)
		{
			numerator = (numA*1.0) % numB *1000.0; 
			denominator = numB *1000;
			numA =(int) numerator;
			numB = (int) denominator;
			
			for (int i=0; i<10; i++)
			{
					
			if(numA % 2 ==0 && numB%2==0)
			{
				numA/=2;
				numB/=2;
			}
			else if(numA % 3 ==0 && numB%3==0)
			{
				numA/=3;
				numB/=3;
			}
			else if(numA % 5 ==0 && numB%5==0)
			{
				numA/=5;
				numB/=5;
			}
			else if(numA % 7 ==0 && numB%7==0)
			{
				numA/=7;
				numB/=7;
			}
			}
			if(numA != 0 && numB != 0)
			{
			System.out.print(numA + "/"+numB);
			}
		}
		

	}

}
