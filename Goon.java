import java.util.Scanner;


public class Goon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		int one = a.charAt(0)-48+a.charAt(1)-48+a.charAt(2)-48;
		int two = a.charAt(4)-48+a.charAt(5)-48+a.charAt(6)-48;
		int three = a.charAt(8)-48+a.charAt(9)-48+a.charAt(10)-48+a.charAt(11)-48;
		
		if(one == two && two==three)
		{
			System.out.println("Goony!");
		}
		else
		{
			System.out.println("Pick up the phone!");
		}
	
		
		
		

	}

}
