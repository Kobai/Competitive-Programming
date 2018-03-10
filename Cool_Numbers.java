import java.util.Scanner;


public class Cool_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int cool = 0;
		
		for(int i = x; i<=y; i++)
		{
			if(Math.sqrt(i)==(int)(Math.sqrt(i)) && Math.cbrt(i)==(int)(Math.cbrt(i)))
				cool++;
		}
		System.out.println(cool);

	}

}
