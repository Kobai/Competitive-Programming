import java.util.Scanner;


public class Pulse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int min = input.nextInt();
		int max = input.nextInt();
		int waves;
		int receive = 0;
		
		for(int i=0; i<num; i++)
		{
			waves = input.nextInt();
			if(waves >= min && waves <=max)
			{
				receive++;
			}
			System.out.println(receive);
		}
			
			
	}

}
