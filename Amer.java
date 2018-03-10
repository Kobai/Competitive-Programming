import java.util.Scanner;


public class Amer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		
		while(!a.equals("quit!"))
		{
			if(a.charAt(a.length()-2)=='o')
			{
				if(a.length()>3)
				{
					if(a.charAt(a.length()-3)!='a' && a.charAt(a.length()-3)!='e'&&a.charAt(a.length()-3)!='i'&&a.charAt(a.length()-3)!='o'&&a.charAt(a.length()-3)!='u'&&a.charAt(a.length()-3)!='y')
						System.out.println(a.substring(0, a.length()-2)+"our");
					else
						System.out.println(a);
				}
				else
					System.out.println(a);
			}
			else
				System.out.println(a);
			a=input.next();
			
		}

	}

}
