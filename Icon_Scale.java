import java.util.Scanner;


public class Icon_Scale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		String a ="";
		String b ="";
		String c ="";
		
		for(int i = 0; i<x; i++)
		{
			a+="*";	
		}
		for(int j = 0; j<x; j++)
		{
			a+="x";
		}
		for(int k = 0; k<x; k++)
		{
			a+="*";
		}
		for(int l=0; l<x; l++)
		{
			System.out.println(a);
		}
		
		

		for(int m = 0; m<x; m++)
		{
			b+=" ";
		}
		for(int n = 0; n<x*2; n++)
		{
			b+="x";
		}
		for(int o = 0; o<x; o++)
		{
			System.out.println(b);
		}
		
		
		for(int p = 0; p<x; p++)
		{
			c+="*";
		}
		for(int q = 0; q<x; q++)
		{
			c+=" ";
		}
		for(int r = 0; r<x; r++)
		{
			c+="*";
		}
		
		for(int s = 0; s<x; s++)
		{
			System.out.println(c);
		}

	}

}
