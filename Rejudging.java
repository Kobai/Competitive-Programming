import java.util.Scanner;


public class Rejudging {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num= input.nextInt();
		String[] lines = new String[num];
		int n=0;
		int m=0;
		int p =0;
		
		
		for (int i = 0; i<num; i++)
		{
			lines[i] = input.next();
			
			if(lines[i].equals("WA")&&Math.floor(m*.3)>=i)
			{
				lines[i]= "AC";
				m++;
				
			}
				
			
			
			if (lines[i].equals("TLE"))
			{
				lines[i] = "WA";
			}
			
			
			
			if(lines[i].equals("IR")&&n<10)
			{
				lines[i] = "AC";
				n++;
			}
			else if (lines[i].equals("IR")&&n<20 )
			{
				lines[i]="WA";
				n++;
			}
			
		
		}
		for (int y =0; y<num; y++)
		{
			System.out.println(lines[y]);
		}
		
	}

}
