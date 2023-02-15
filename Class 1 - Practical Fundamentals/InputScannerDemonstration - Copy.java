package firstpack;
import java.util.Scanner;
public class InputScannerDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int input = scan.nextInt();
		System.out.println("Enter another number:");
		int second_input = scan.nextInt();
		System.out.println(input+1);
		System.out.println(second_input+1);
		scan.close();
	}

}
