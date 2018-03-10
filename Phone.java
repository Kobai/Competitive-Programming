import java.util.Scanner;


public class Phone {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String number = input.nextLine();
		String code = "";
		
		for(int i = 0; i<number.length(); i++)
		{
			if(number.charAt(i)==' '){
				code = number.substring(0,i);
			}
		}
		
		if(number.length()==11)
		{
			switch(code)
			{
			case "416":
				System.out.println("valuable");
				break;
				
			case "647":
			case "437":
				System.out.println("valueless");
				break;
				
				default:
					System.out.println("invalid");
					break;
			}
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
