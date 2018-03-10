import java.util.Scanner;


public class Office {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int yearA = input.nextInt();
		int yearB = input.nextInt();
		
		
		System.out.println("All positions change in year "+yearA);
		
		while(yearA <=  yearB - 60)
		{
			yearA+= 60;
		
			System.out.println("All positions change in year "+ (yearA));
		
		}

	}

}
