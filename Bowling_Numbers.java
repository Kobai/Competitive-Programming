import java.util.Scanner;


public class Bowling_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i<=t; i++)
		{
			int pins = sc.nextInt();
			int balls = sc.nextInt();
			int width = sc.nextInt();
			
			int max = 0;
			int[] ballMax = new int[balls];
			int[] pinArrange= new int[pins];
			
			for(int j = 0; j<pins; j++)
			{
				pinArrange[j] = sc.nextInt();
			}
			max = rollBall(1,1,width,pinArrange,balls);
			System.out.println(max);
		}
		
	}
	public static int rollBall(int ballNum, int ballPosition, int width,int[]pinArrange,int maxBallNum)
	{
		if(ballNum<=maxBallNum && ballPosition<pinArrange.length-width+2)
		{
		int sum = 0;
		for(int i = ballPosition; i<ballPosition+width; i++)
		{
			sum+= pinArrange[i-1];
		}
		
		for(int i=0; i<pinArrange.length()-ballPosition; i++)
		{
			int restScore = rollBall(ballNum+1, ballPosition+width+i,width,pinArrange, maxBallNum);
		}
		
		}
		else
		{
			return 0;
		}
	}

}
