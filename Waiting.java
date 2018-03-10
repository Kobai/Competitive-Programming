import java.util.Scanner;


public class Waiting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		int ax;
		int ay;
		int az;
		int aT;
		String b = input.next();
		int bx;
		int by;
		int bz;
		int bT;
		
		ax = ((a.charAt(0)-48)*10+(a.charAt(1)-48))*3600;
		ay = ((a.charAt(3)-48)*10+(a.charAt(4)-48))*60;
		az = (a.charAt(6)-48)*10+(a.charAt(7)-48);
		aT = ax+ay+az;
		
		bx = ((b.charAt(0)-48)*10+(b.charAt(1)-48))*3600;
		by = ((b.charAt(3)-48)*10+(b.charAt(4)-48))*60;
		bz = (b.charAt(6)-48)*10+(b.charAt(7)-48);
		bT = bx + by + bz;
		
		System.out.println(bT-aT);
		
		
		
		
				
			
		
	}

}
