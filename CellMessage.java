import java.util.Scanner;


public class CellMessage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String x = input.next();
		int y = 0;
		char b;
		while(!(x.equals("halt")))
		{
			for(int i = 0; i<x.length(); i++)
			{
				char a = x.charAt(i);
				
				switch(a)
				{
				case 'a':
				case 'd':
				case 'g':
				case 'j':
				case 'm':
				case 'p':
				case 't':
				case 'w':
					y++;
					break;
					
				case 'b':
				case 'e':
				case 'h':
				case 'k':
				case 'n':
				case 'q':
				case 'u':
				case 'x':
					y+=2;
					break;
					
				case 'c':
				case 'f':
				case 'i':
				case 'l':
				case 'o':
				case 'r':
				case 'v':
				case 'y':
					y+=3;
					break;
					
				case 's':
				case 'z':
					y+=4;
					break;
				}
				
				if(i<0)
				{
					b = x.charAt(i-1);
					{
						if(Math.abs((int)(a-b))<=3)
						{
							y+=1;
						}
						
						else if(a == 's'||a=='z')
						{
							y++;
						}
					}
				 }
				
				
			}
			
			System.out.println(y);
			y=0;
			x = input.next();
			
			
		}

	}

}
