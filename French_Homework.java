import java.util.Scanner;


public class French_Homework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String verb = input.next();
		String a = "-tu ";
		String b="";
		String noun = input.next();
		;
		
		if(noun.charAt(noun.length()-1)=='s')
		{
			b = "les ";
		}
		
		else if(noun.charAt(noun.length()-1)=='e')
		{
			b = "la ";
		}
		
		else
		{
			b = "le ";
		}
		
		System.out.println(verb+a+b+noun+" ?");

	}

}
