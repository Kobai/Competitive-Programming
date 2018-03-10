import java.util.Scanner;


public class MultipleChoice 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String[] a = new String[num];
		String[]b = new String[num];
		int x = 0;
		
		for(int i= 0; i<num; i++)
		{
			a[i] = input.next();
		}
		
		for(int i= 0; i<num; i++)
		{
			b[i] = input.next();
		}
		for(int i= 0; i<num; i++)
		{
			if(a[i].equals(b[i]))
			{
				x++;
			}
		}
		System.out.println(x);
		
		

	}

}
