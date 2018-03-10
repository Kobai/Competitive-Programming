import java.util.Scanner;


public class Cell_Sell {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double day = input.nextDouble();
		double evening = input.nextDouble();
		double weekend = input.nextDouble();
		double planA;
		double planB;
		double dayA = day;
		double eveningA = evening;
		double weekendA = weekend;
				
		
		day = (day-100)*.25;
		
		if(day < 0)
		{
			day = 0;
		}
		
		evening = evening * .15;
		weekend = weekend*.2;
		planA = day + evening + weekend;
		
		System.out.format("Plan A costs " + "%.2f",planA);
		System.out.println();
		
		dayA = (dayA-250)*.45;
		
		if(dayA < 0)
		{
			dayA = 0;
		}
		
		eveningA = eveningA * .35;
		weekendA = weekendA*.25;
		planB = dayA + eveningA + weekendA;
		
		
		System.out.format("Plan B costs " + "%.2f",planB);
		System.out.println();
		
		if(planA == planB)
		{
			System.out.println("Plan A and B are the same price.");
		}
		else if (planA > planB)
		{
			System.out.println("Plan B is cheapest.");
		}
		else
		{
			System.out.println("Plan A is cheapest.");
		}
		
		
		
	}

}
