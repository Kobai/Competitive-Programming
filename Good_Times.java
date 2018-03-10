import java.util.Scanner;


public class Good_Times {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		System.out.println(num+" in Ottawa");
		
		if(num-300 <=0)
		{
			System.out.println(num-300+2400+" in Victoria");
		}
		else
		{
			System.out.println(num-300+" in Victoria");
		}
		
		if(num-200 <=0)
		{
			System.out.println(num-200+2400+" in Edmonton");
		}
		else
		{
			System.out.println(num-200+" in Edmonton");
		}
		
		if(num-100 <=0)
		{
			System.out.println(num-100+2400+" in Winnipeg");
		}
		else
		{
			System.out.println(num-100+" in Winnipeg");
		}
		
	
		System.out.println(num+" in Toronto");
		
		if(num+100 >= 2400)
		{
			System.out.println(num+100-2400+" in Halifax");
		}
		else
		{
			System.out.println(num+100+" in Halifax");
		}
		
		if(num+130>=2400)
		{
			System.out.println(num+130-2400+" in St. John's");
		}
		else
		{
			System.out.println(num+130+" in St. John's");
		}
		
		

	}

}
