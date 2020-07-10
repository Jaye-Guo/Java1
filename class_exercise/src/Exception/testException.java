package Exception;

import java.util.Scanner;

public class testException {

	public static void main(String[] args) {
		testException();
	}
	
	public static void testException() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a divisor: ");
		try {
			int divisor = scanner.nextInt();
			if (divisor == 0) {
				throw new Exception("show message");
			}
			System.out.println(10/divisor);
		}
		catch (Exception e) {
			System.err.println("There is an exception.");
			System.err.println(e.getMessage());
		}
		finally {
			scanner.close();
		}
	
	}
}
