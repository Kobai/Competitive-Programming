import java.util.Scanner;


public class ISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		b*=3;
		
		System.out.println("The 1-3-sum is "+ (91+a+b+c));

	}

}
