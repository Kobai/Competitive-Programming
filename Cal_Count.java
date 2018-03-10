import java.util.Scanner;


public class Cal_Count {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	
		int[] burger = {461,431,420,0};
		int[] side = {100,57,70,0};

		int[] drink = {130,160,118,0};

		int[] dessert = {167,266,75,0};



		int calCount = 0;



		calCount += burger[input.nextInt()-1];

		calCount += side[input.nextInt()-1];

		calCount += drink[input.nextInt()-1];

		calCount += dessert[input.nextInt()-1];



		System.out.println("Your total Calorie count is "+calCount+".");


	}
}
