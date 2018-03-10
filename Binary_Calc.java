import java.util.Scanner;

public class Binary_Calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int nums = input.nextInt();
		String binary = "";

		for (int i = 0; i < nums; i++) 
		{

			while (num > 1) 
			{
				if (num % 2 == 0) 
				{
					binary += "0";
				} 
				else
				{
					binary += "1";
				}
				num /= 2;
			}
			
			if (num == 1) 
			{
				binary += "1";
			} 
			else 
			{
				binary += "0";
			}
			String print = new StringBuffer(binary).reverse().toString();
			System.out.println(print);

		}

	}

}
