import java.util.ArrayList;
import java.util.Scanner;


public class Bridge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxWeight = sc.nextInt();
		int trains=sc.nextInt();
		int numCross = 0;
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		for(int i = 0; i<trains; i++)
		{
			list.add(sc.nextInt());
		}
		
		
		while(list.size()>3)
		{
			int x = 0;
			for(int i = 0; i<4; i++)
			{
				x+= list.get(i);
			}
			
			if(x<=maxWeight)
			{
				numCross++;
				list.remove(0);
			}
			else
			{
				if(numCross>0)
				{
					numCross+=3;
				}
				break;
			}
		}
		System.out.println(numCross);

	}

}
