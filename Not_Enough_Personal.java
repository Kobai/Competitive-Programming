import java.util.Scanner;


public class Not_Enough_Personal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numEmploy = input.nextInt();
		String[] employees = new String[numEmploy];
		int[] employSkills = new int[numEmploy];
	
		
		
		for(int i=0; i<numEmploy; i++)
		{
			employees[i] = input.next();
			employSkills[i] = input.nextInt();
		}
		
		int numApply = input.nextInt();
		int[] level = new int[numApply];
		int[] adapt = new int[numApply];
		int[] range = new int[numApply];
		
		for(int j=0; j<numApply; j++)
		{
			level[j] = input.nextInt();
			adapt[j] = input.nextInt();
			range[j] = level[j] + adapt[j];
		}
		
		for(int k=0; k<numEmploy; k++)
		{
			for(int l=0; l<numApply; l++)
			{
				if(employSkills[k]>=level[l] && employSkills[k] <= range[l])
				{
					System.out.println(employees[k]);
				}
			}
			
		}
		
	
		
	}

}
