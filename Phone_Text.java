import java.util.Scanner;


public class Phone_Text {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String a = input.next();
		char[] x = new char[a.length()];
		int b = 0;
		
		while(!(a.equals("halt")))
		{
			
			for(int i = 0; i<a.length(); i++)
			{
				x[i] = a.charAt(i);
				
				switch(x[i])
				{
				case 'a':
				case 'd':
				case 'g':
				case 'j':
				case 'm':
				case 'p':
				case 't':
				case 'w':
					b++;
					break;
					
				case 'b':
				case 'e':
				case 'h':
				case 'k':
				case 'n':
				case 'q':
				case 'u':
				case 'x':
					b +=2;
					break;
					
				case 'c':
				case 'f':
				case 'i':
				case 'l':
				case 'o':
				case 'r':
				case 'v':
				case 'y':
					b+=3;
					break;
					
				
				case 's':
				case 'z':
					b+=4;
					break;
				}
			}
			System.out.println(b);
			b=0;
			a = input.next();
			x = new char[a.length()];
		}

	}

}
