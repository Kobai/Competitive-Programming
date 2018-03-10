import java.util.Arrays;
import java.util.Scanner;


public class Call {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String x;
		String y="";
		String z="";
		
		for(int i = 0; i<a; i++)
		{
			 x = sc.next();
		
			
			for(int j=0; j<x.length(); j++)
			{
				if(x.charAt(j)!='-')
				{
					y+=x.charAt(j);
				}
			}
			
			if(y.length()>10)
			{
				y = y.substring(0,10);
			}
			for(int j = 0; j<y.length(); j++)
			{
				switch(y.charAt(j))
				{
					case 'A':
					case 'B':
					case 'C':
						z+="2";
						break;
					case 'D':
					case 'E':
					case 'F':
						z+="3";
						break;
					case 'G':
					case 'H':
					case 'I':
						z+="4";
						break;
					case 'J':
					case 'K':
					case 'L':
						z+="5";
						break;
					case 'M':
					case 'N':
					case 'O':
						z+="6";
						break;
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
						z+="7";
						break;
					case 'T':
					case 'U':
					case 'V':
						z+="8";
						break;
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':	
						z+="9";
						break;
						
						default:
							z+=y.charAt(j);
							break;
				}
			}
			
			System.out.println(z.substring(0,3)+"-"+z.substring(3,6)+"-"+z.substring(6,10));
			x="";
			y="";
			z="";
		}
	}
	
	

}
