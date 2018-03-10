import java.util.Scanner;

/**
 * 
 */

/**
 * @author victorkobayashi2
 *
 */
public class DWITE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		

		int day;
		int month;
		int year;

		System.out.println("Enter you birth date: DD MM YYYY:");
		day = input.nextInt();
		month = input.nextInt();
		year = input.nextInt();

		if (year < 1997) {
			System.out.println("old enough");
		} else if (year == 1997) {
			if (month > 10) {
				System.out.println("too young");
			}

			else if (month <= 10) {
				if (day > 27) {
					System.out.println("too young");
				}

				else if (day <= 27) {
					System.out.println("old enough");
				}
			}
		}
	}
}
