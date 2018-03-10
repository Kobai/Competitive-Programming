import java.util.Arrays;
import java.util.Scanner;


public class List_Min {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int[] numbers = new int[num];
		
		for(int i=0; i<num; i++)
		{
			numbers[i] = input.nextInt();
		}
		
		Arrays.sort(numbers);
		
		for(int j = 0; j<num; j++)
		{
			System.out.println(numbers[j]);
		}
		
	}

}
