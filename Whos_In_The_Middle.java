import java.util.Scanner;


public class Whos_In_The_Middle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if(a >= b && c >= a){
			System.out.println(a);
		}
		else if(b >= a && a >= c){
			System.out.println(a);
		}
		else if(a >= b && b >= c){
			System.out.println(b);
		}
		else if(b >= a && c >= b){
			System.out.println(b);
		}
		else{
			System.out.println(c);
		}
	}

}
