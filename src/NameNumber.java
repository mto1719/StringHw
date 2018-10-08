/**
 * Matthew To
 */
import java.util.Scanner;
public class NameNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input your name: ");
		String name = in.next();
		in.nextLine();
		System.out.print("Please input your phone number: ");
		String number = in.next();
		in.nextLine();
		String firstThree = number.substring(0,3);
		String nextThree = number.substring(3,6);
		String lastFour = number.substring(6,10);
		String newNumber = "(" + firstThree + ")" + nextThree + "-" + lastFour;
		System.out.printf("%-20s %s", name, newNumber);
	}

}
