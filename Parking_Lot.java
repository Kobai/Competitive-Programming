import java.util.Scanner;


public class Parking_Lot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int nums = input.nextInt();
		String[] point= new String[nums];
		int move;
		int x =0;
		int y =0;
		
		for(int i=0; i<nums; i++)
		{
			point[i]= input.next();
			move = input.nextInt();
			if(point[i].equals("North"))
			{
				y+=move;
			}
			else if(point[i].equals("South"))
			{
				y-=move;
			}
			else if(point[i].equals("East"))
			{
				x+=move;
			}
			else if(point[i].equals("West"))
			{
				x-=move;
			}
		}
		System.out.println(x + " " +y);
	}

}
