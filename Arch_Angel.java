import java.util.Scanner;


public class Arch_Angel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		int b =0;
		int f =0;
		int t =0;
		int l =0;
		int c =0;
		
		for(int i=0; i<a.length(); i++)
		{
			if(a.charAt(i)=='B')
			{
				b++;
			}
			else if(a.charAt(i)=='F')
			{
				f++;
			}
			else if(a.charAt(i)=='T')
			{
				t++;
			}
			else if(a.charAt(i)=='L')
			{
				l++;
			}
			else if(a.charAt(i)=='C')
			{
				c++;
			}
		}
		if(b==0)
		{
			System.out.println("B");
		}
		if(f==0)
		{
			System.out.println("F");
		}

		if(t==0)
		{
			System.out.println("T");
		}
		 if(l==0)
		{
			System.out.println("L");
		}
		 if(c==0)
		{
			System.out.println("C");
		}
		if(b!= 0 && f!= 0 && t!= 0 && l!= 0 && c!= 0)
		{
			System.out.println("NO MISSING PARTS");
		}
		
	}

}
