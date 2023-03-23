package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// exception = an event that occurs during the execution of a program that,
		//				disrupts the normal flow ò instructions
		
		Scanner sc = new Scanner(System.in);
		
		try {

			System.out.println("Enter a whole number to divide: ");
			int x = sc.nextInt();

			System.out.println("Enter a whole number to divide by: ");
			int y = sc.nextInt();

			int z = x / y;

			System.out.println("Result: " + z);
		} catch (ArithmeticException e) {
			System.out.println("You can't divide by zero!");
		} catch (InputMismatchException e) {
			System.out.println("you should enter a number");
		} catch (Exception e) {
			System.out.println("somethins went wrong");
		} finally {
			System.out.println("This will always print");
		}
	}

}
