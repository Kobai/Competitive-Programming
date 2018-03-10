import java.util.Scanner;


public class Squares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		num = (int)(Math.sqrt(num));
		
		System.out.println("The largest square has side length " + num + ".");
	}

}
