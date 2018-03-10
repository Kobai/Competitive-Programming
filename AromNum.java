import java.util.Scanner;

public class AromNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String aro = sc.nextLine();
		
		int base = 0;
		int lastBase = 0;
		int sum = 0;
		
		for (int i = aro.length() - 1; i >= 0; i--)
		{
			if (i % 2 == 1)
			{
				base = getBase(aro.charAt(i));
				if (base<lastBase)
					base=-base;
				lastBase = Math.abs(base);
			}
			else
				sum+= base * ((int)aro.charAt(i)-48);
			
			
		}	
		System.out.println(sum);	
	}
	public static int getBase(char c)
	{
		int base =0;
		switch(c)
		{
		case 'I':
			base = 1;
			break;
		case 'V':
			base = 5;
			break;
		case 'X':
			base = 10;
			break;
		case 'L':
			base = 50;
			break;
		case 'C':
			base = 100;
			break;
		case 'D':
			base = 500;
			break;
		case 'M':
			base = 1000;
			break;
		}
		return base;
	}

}