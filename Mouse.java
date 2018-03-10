import java.util.Scanner;

public class Mouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int xBound = sc.nextInt();
		int yBound = sc.nextInt();
		int vx = sc.nextInt();
		int vy = sc.nextInt();
		int x=0;
		int y=0;
		
		while(vx!=0 || vy!=0)
		{
			x+=vx;
			y+=vy;
			
			if(x<0)
				x=0;
			if(x>xBound)
				x = xBound;
			if(y<0)
				y=0;
			if(y>yBound)
				y= yBound;
			
			System.out.println(x+" "+y);
			vx= sc.nextInt();
			vy = sc.nextInt();
		}
	
		
	}

}
