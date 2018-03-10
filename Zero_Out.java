import java.util.Scanner;
import java.util.Stack;


public class Zero_Out
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Stack<Integer> stackNum = new Stack<Integer>();
		for(int i=0; i<num; i++)
		{
			int curNum = sc.nextInt();
			if(curNum ==0)
			{
				stackNum.pop();
			}
			else
			{
				stackNum.push(curNum);
			}
		}
		int sum =0;
		while(!stackNum.isEmpty())
		{
			sum+=stackNum.pop();
		}
		System.out.println(sum);
	}
}
