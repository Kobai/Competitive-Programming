import java.util.Scanner;


public class Lowest_Mark {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();	//85
		double b = input.nextDouble();	//90
		double c = input.nextDouble()/10;	//3
		double grade = 10 - c;//7
		//90*10 - 85*7 = 900 - 595 = 305
		int gradeDif = (int)((b*10 - a*grade)/10) *10; 
		int mark = gradeDif/(int)(c); //300/3
		double real = (b*10 + gradeDif)/10;
	
		
		
		
		if(mark<=100)
		{
			System.out.println(mark);
		}
		else
		{
			System.out.println("DROP THE COURSE");
		}
		
		
		
		
		
	
		
		
		
		
		

	}

}
