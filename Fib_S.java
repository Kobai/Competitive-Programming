import java.util.Scanner;


public class Fib_S {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int out = 0;
		
		for(int i = 0; i<num; num++)
		{
			out+=i+ ++i;
		}
		System.out.println(out);
	}

}
