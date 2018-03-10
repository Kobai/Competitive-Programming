import java.util.Scanner;

public class DMOJ {

	private static final String X = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		byte l;
		byte pieces = 0;
		String line;
		String output = "";
		boolean lastX = true;

		
		l = input.nextByte();

		
		line = input.nextLine();

		if (line.length() > l) 
		{
			line = line.substring(0, l);
		} else
		{
			line = input.nextLine();
		}

		for (int i = 0; i < l; i++) 
		{
			if (line.charAt(i) == 'X') 
			{
				if (lastX == false) 
				{
				
					output = output + "\n";
					pieces++;
					lastX = true;
				}
				if (i == l-1)
				{
					pieces--;
				}

			} else 
			{
				if (pieces == 0) 
				{
					pieces++;
				}
				output = output + "O";
				lastX = false;

			}

		}
		if (pieces < 0){
			pieces = 0;
		}

		System.out.println(pieces);
		System.out.print(output);

	}

}
