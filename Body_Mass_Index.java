import java.util.Scanner;


public class Body_Mass_Index {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		double weight;
		double height;
		double mass;
		
		weight = input.nextDouble();
		height = input.nextDouble();
		mass = weight / Math.pow(height, 2);
		
		if (mass < 18.5){
			System.out.println("Underweight");
		}
		else if (mass > 25.0){
			System.out.println("Overweight");
		}
		else{
			System.out.println("Normal weight");
		}

	}

}
