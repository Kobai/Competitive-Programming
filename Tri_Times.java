import java.util.Scanner;


public class Tri_Times {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aOne;
		int aTwo;
		int aThree;
		
		aOne = input.nextInt();
		aTwo = input.nextInt();
		aThree = input.nextInt();
		
		if(aOne + aTwo + aThree == 180)
		{
			if(aOne == aTwo && aOne == aThree && aTwo == aThree){
				System.out.println("Equilateral");
			}
			else if (aOne == aTwo || aOne == aThree || aTwo == aThree){
				System.out.println("Isosceles");
			}
			else{
				System.out.println("Scalene");
			}
	
		}
		else{
			System.out.println("Error");
		}

	}

}
