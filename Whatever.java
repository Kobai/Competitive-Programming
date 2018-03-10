import java.util.Scanner;


public class Whatever {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String bean = sc.nextLine();
		String cheese = "";
		for(int i = 0; i<bean.length(); i++)
		{
			char x = bean.charAt(i);
			if(i%2==0)
				x--;
			else
				x++;
			cheese+=x;
		}
		System.out.println(cheese);
		
	}

}
