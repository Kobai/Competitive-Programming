import java.util.Scanner;

public class Jersey_New {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int j = sc.nextInt();
		int a = sc.nextInt();
		char sizeJ[]=new char[j];
		
		int requestS =0;
		
		for(int i=0; i<j; i++)
			sizeJ[i] = sc.next().charAt(0);
			
		for(int i = 0; i<a; i++)
		{
			char sizeW = sc.next().charAt(0);
			int numW = sc.nextInt();
			
			if(sizeJ[numW-1]<=sizeW)
			{
				requestS++;
				sizeJ[numW-1] = 'Z';
			}
			
		}
		
	
		System.out.println(requestS);
		
		

	}

}
