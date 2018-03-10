import java.util.Scanner;


public class Txt_Message {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		
		while(!(a.equals("TTYL")))
		{
			switch(a)
			{
			case "CU":
				System.out.println("see you");
				break;
			case ":-)":
				System.out.println("I'm happy");
				break;
			case ":-(":
				System.out.println("I'm unhappy");
				break;
			case ";-)":
				System.out.println("wink");
				break;
			case ":-P":
				System.out.println("stick out my tongue");
				break;
			case "(~.~)":
				System.out.println("sleepy");
				break;
			case "TA":
				System.out.println("totally awesome");
				break;
			case "CCC":
				System.out.println("Canadian Computing Competition");
				break;
			case "CUZ":
				System.out.println("because");
				break;
			case "TY":
				System.out.println("thank-you");
				break;
			case "YW":
				System.out.println("you're welcome");
				break;
				
				default:
					System.out.println(a);
			
			}
			a = input.next();
		}
		System.out.println("talk to you later");

	}

}
