import java.util.Arrays;
import java.util.Scanner;


public class Plushies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pHeight = input.nextInt();
		int numP = input.nextInt();
		int[] heights = new int[numP];
		int runInto=0;
		
		for(int i=0; i<numP; i++)
		{
			heights[i] = input.nextInt();
		}
		Arrays.sort(heights);
		
		for(int j=0; j<numP; j++)
		{
			if(heights[j] >= pHeight)
			{
				runInto++;
			}
		}
		System.out.println(runInto);
		
		

	}

}
