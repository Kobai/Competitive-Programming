import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jerseys {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int j = Integer.parseInt(in.readLine());
		int a = Integer.parseInt(in.readLine());
		char sizeJ[]=new char[j];
		
		int requestS =0;
		
		for(int i=0; i<j; i++)
		{
			sizeJ[i] = in.readLine().charAt(0);
			
		}
		
		for(int i = 0; i<a; i++)
		{
			String[] tokens = in.readLine().split(" ");
			char sizeW = tokens[0].charAt(0);
			int numW = Integer.parseInt(tokens[1]);
			if(sizeJ[numW-1]<=sizeW)
			{
				requestS++;
				sizeJ[numW-1] = 90;
			}
			
		}
		
	
		System.out.println(requestS);
		
		

	}

}
