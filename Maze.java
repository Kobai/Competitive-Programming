import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Maze {

	public static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 0; i<x; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			char[][] grid = new char[a][b];
			
			for(int j = 0; j<a; j++)
			{
				String stuff = sc.next();
				for(int k = 0; k<b; k++)
					grid[j][k] = stuff.charAt(k);
			}
			check(grid,0,0,a,b,0);
			Collections.sort(list);
			System.out.println(list.get(0));
			list.clear();
		}
	
	}
	public static void check(char[][]grid, int x, int y, int xb, int yb,int count)
	{
		if(x>=0 && x<xb &&y>=0 && y<yb)
		{
			if(grid[x][y]!='*')
			{
				count++;
				if(x==xb-1&&y==yb-1)
					list.add(count);
				
				else if(grid[x][y]=='+')
				{
					grid[x][y]='*';
					check(grid,x-1,y,xb,yb,count);
					check(grid,x+1,y,xb,yb,count);
					check(grid,x,y-1,xb,yb,count);
					check(grid,x,y+1,xb,yb,count);
				}
				else if(grid[x][y]=='-')
				{
					grid[x][y]='*';
					check(grid,x-1,y,xb,yb,count);
					check(grid,x+1,y,xb,yb,count);
				}
				else if(grid[x][y]=='|')
				{
					grid[x][y]='*';
					check(grid,x,y-1,xb,yb,count);
					check(grid,x,y+1,xb,yb,count);
				}
			}
		}
	}

}
