import java.util.Scanner;


public class WaitingTime
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int actions = input.nextInt();
		int[] recv = new int[101];
		int[] send = new int[101];
		int time = 0;
		
		for(int i = 0; i<101; i++)
		{
			recv[i]=-1;
			send[i] = -1;
		}
				
		
		for(int i=0; i<actions; i++)
		{
			String sendRecv = input.next();
			int friend = input.nextInt();
			
			if(sendRecv.equals("R"))
			{
				recv[friend] = time;
			}
			else if (sendRecv.equals("S"))
			{
				send[friend] = time;
			}
			else
			{
				time+= friend-1;
			}
			time++;
				
		}
		for(int i= 0; i<101; i++)
		{
			if(recv[i]!=-1)
			{
			System.out.println(i+" "+ ((send[i]-recv[i])-1));
			}
		}
		

	}

}
