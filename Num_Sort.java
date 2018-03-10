import java.util.Arrays;
import java.util.Scanner;


public class Num_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b[] = new int[900];
		for(int i = 0; i<900; i++)
		{
			b[i]=sc.nextInt();
			if(b[i]==42069)
			{
				i=900;
			}
		}
		Arrays.sort(b);
		for(int i = 0; i<900; i++)
		{
			if(b[i]!=0 && b[i]!=42069)
				System.out.println(b[i]);
		}

	}

}
