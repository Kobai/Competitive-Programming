import java.util.Scanner;


public class Trident {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a = "";
		String e = "";
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		for (int  i=0; i<3; i++)
		{
			a += "*";
			for (int n = 0; n<c; n++)
			{
				a+= " ";
			}
		}
		
		for(int x = 0; x<b; x++)
		{
			System.out.println(a);
		}
		
		
		for(int y = 0; y<(c*2+3); y++)
		{
			System.out.print("*");
		}
		
		for(int z = 0; z<(c+1); z++)
		{
			e+= " ";
		}
		
		e+="*";
		System.out.println();
		
		for (int k=0; k<d; k++)
		{
			System.out.println(e);
		}
	}

}
