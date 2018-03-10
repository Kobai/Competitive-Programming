import java.util.Scanner;


public class From_1987 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		int a = x%10000 /1000;  
		int b = x%1000 /100; 
		int c = x%100 /10;
		int d = x%10;
		
		
		
		
		while(a==b || a==c || a==d || b==c || b==d || c==d)
		{
			x++;
			
			 a = x%10000 /1000;  
			 b = x%1000 /100; 
			 c = x%100 /10;
			 d = x%10;
			 
			
		}
		System.out.println(x);
		
		

	}

}
