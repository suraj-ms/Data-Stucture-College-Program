package college;
import java.util.Scanner;

public class Exception {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a and b value");
		int a = scan.nextInt();
		int b = scan.nextInt();
		try {
			int result=a/b;
			System.out.println("Result="+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error");
		}
	}

}
