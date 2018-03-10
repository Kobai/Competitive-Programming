import java.util.Scanner;


public class Main3 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String old = input.next();
		String neo = "";
		char x;
		char y;
		char z;
		
		
		for(int i = 0; i<old.length(); i++)
		{
			if(old.charAt(i)== 'a'||old.charAt(i)== 'e'||old.charAt(i)== 'i'||old.charAt(i)== 'o'||old.charAt(i)== 'u')
			{
				neo+=old.charAt(i);
			}
			else
			{
				neo+= old.charAt(i);
				x = old.charAt(i);
				y = old.charAt(i);
				z = old.charAt(i);
				z++;
				
				while(x != 'a'&&x != 'e'&&x != 'i'&&x != 'o'&&x != 'u'&& y != 'a'&&y != 'e'&&y != 'i'&&y != 'o'&&y != 'u')
				{
					x++;
					y--;
				}
				
				if(y== 'a'||y== 'e'||y== 'i'||y== 'o'||y== 'u')
				{
					neo+=y;
					
				}
				
				else 
				{
					neo+=x;
				}
				while(z== 'e'||z== 'i'||z == 'o'||z == 'u')
				{
					z++;
				}
				if(z > 'z')
				{
					neo+='z';
				}
				else
				{
					neo+=z;
				}
				
			}
			
	
		}
		System.out.println(neo);

	}

}
