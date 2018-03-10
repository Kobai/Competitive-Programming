import java.util.Scanner;


public class Gates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numGates = sc.nextInt();
		int numPlanes = sc.nextInt();
		boolean[] gates = new boolean[numGates+1];
		int planesLanded = 0;
		
		for(int i = 0; i< numPlanes; i++)
		{
			int reqGate = sc.nextInt();
			
			if(gates[reqGate]==false)
			{
				gates[reqGate] = true;
				planesLanded++;
			}
			else
			{
				boolean closeAirport = true;
				for(int j= reqGate-1; j>0; j--)
				{
					if(gates[j]==false)
					{
						gates[j] = true;
						planesLanded++;
						closeAirport = false;
						j=0;
					}
				}	
				if(closeAirport)
				{
					i = numPlanes;
				}
			}
		}
		System.out.println(planesLanded);
		

	}

}
