import java.util.Scanner;


public class Tiles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int width = input.nextInt();
		int length = input.nextInt();
		int tile = input.nextInt();
		
		length = length/tile;
		width = width/tile * length;
		
		System.out.println(width);
		
		

	}

}
