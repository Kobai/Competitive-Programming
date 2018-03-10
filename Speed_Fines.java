import java.util.Scanner;


public class Speed_Fines {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int speedL;
		int speedD;
		int fine;
		
		speedL = input.nextInt();
		speedD = input.nextInt();
		
		if (speedL >= speedD){
			System.out.println("Congratulations, you are within the speed limit!");
		}
		fine = speedD - speedL;
		if(fine >=1 && fine <=20){
			System.out.println("You are speeding and your fine is $100.");
		}
		else if(fine >=21 && fine <=30){
			System.out.println("You are speeding and your fine is $270.");
		}
		else if(fine >= 31){
			System.out.println("You are speeding and your fine is $500.");
		}
		
		

	}

}
