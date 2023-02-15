package firstpack;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number");
		int firstnum = scan.nextInt();
		System.out.println("Enter your second number");
		int secondnum = scan.nextInt();
		int sum = firstnum+secondnum;
		System.out.println(sum);
		scan.close();
	}

}
