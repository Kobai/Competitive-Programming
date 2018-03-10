import java.util.Scanner;


public class Freedom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		int enemy = input.nextInt();
		int shots = enemy;
		int[] enemyX = new int[enemy];
		int[] enemyY = new int[enemy];
		int[] enemyZ = new int[enemy];
		
		for(int i =0; i<enemy; i++)
		{
			enemyX[i]=input.nextInt();
			enemyY[i]=input.nextInt();
			enemyZ[i]=input.nextInt();
			
			if(x==enemyX[i])
			{
				if(y-enemyY[i]==z-enemyZ[i])
				{
					
				}
			}
		}

	}

}
