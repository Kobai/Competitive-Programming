import java.util.Scanner;

public class Gate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gateNum = sc.nextInt();
		int planeNum = sc.nextInt();
		int land = 0;
		int[] gates = new int[gateNum];
		
		for(int i = 0; i<planeNum; i++)
		{
			int plane = sc.nextInt()-1;
			for(int j = plane; j>=0; j--)
			{
				if(gates[j]==0)
				{
					gates[j]=1;
					land++;
					break;
				}
			}
		}
		System.out.println(land);
		
		
		

	}

}
