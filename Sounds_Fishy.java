import java.util.Scanner;


public class Sounds_Fishy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		if (a < b && b < c && c<d){
			System.out.println("Fish Rising");
		}
		else if (a > b && b > c && c>d){
			System.out.println("Fish Diving");
		}
		else if (a == b && b == c && c==d){
			System.out.println("Fish At Constant Depth");
		}
		else{
			System.out.println("No Fish");
		}

	}

}
