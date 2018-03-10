import java.util.Scanner;

public class SpellCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String a = input.nextLine();
		String b = "";
		String c = "";
		String d = "";
		int x = 0;

		while (!(a.equals("No More Words!")))
		{
			x++;
			for (int i = 0; i < a.length(); i++) 
			{
				if (a.charAt(i) == 'i' && i+1 < a.length())
				{
					if (a.charAt(i + 1) == 'e') 
					{
						b = a.substring(0, i);
						c = a.substring(i + 2, a.length());

						if (b.charAt(b.length() - 1) == 'c')
						{
							d = "ei";
							System.out.print(b);
							System.out.print(d);
							System.out.print(c);
							System.out.println();
						} 
						else 
						{
							System.out.println("Word " + x + " is correct.");
						}
					}
				}

				else if (a.charAt(i) == 'e' && i+1 < a.length()) 
				{
					if (a.charAt(i+1) == 'i') 
					{
						b = a.substring(0, i);
						c = a.substring(i + 2, a.length());

						if (b.charAt(b.length()-1) != 'c') 
						{
							d = "ie";
							System.out.print(b);
							System.out.print(d);
							System.out.print(c);
							System.out.println();
						} 
						else 
						{
							System.out.println("Word " + x + " is correct.");
						}
					}
				}
				

			}

			a = input.nextLine();
		}

	}

}
