import java.util.Scanner;

public class AssignPartners {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String x[] = new String[a];
		String y[] = new String[a];
		boolean good = false;
		
		for(int i = 0; i<a; i++)
			x[i]= sc.next();
		for(int i = 0; i<a; i++)
			y[i] = sc.next();
		
		for (int i = 0; i<a; i++)
		{
			good = false;
			String pairs = pair(x[i],y[i]);
			for(int j = 0; j<a; j++)
			{
				if(pairs.equals(pair(y[j], x[j]))&& i!=j)
				{
						good = true;
						
				}
			}
			if(good==false)
				break;
				
		}
		if(good == true)
			System.out.println("good");
		else
			System.out.println("bad");
		
	}
	
	public static String pair(String a, String b)
	{
		return a+" "+b;
	}
}