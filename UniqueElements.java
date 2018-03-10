import java.util.Arrays;
import java.util.Scanner;


public class UniqueElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int[] a = new int[num];
		int b=0;
		int c=0;
		
		for(int i = 0; i<num; i++)
		{
			a[i] = input.nextInt();
		}
		Arrays.sort(a);
		
		for(int i = 0; i<num; i++)
		{
			
			if(a[i]!=b)
			{
				c++;
			}
			b = a[i];
		}
		System.out.println(c);
		
	}

}
