package foo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Nos");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int arr[] = { 2, 6, 5, 8, 4 };
		
		System.out.println("Hello;");

		try {
			System.out.println(x / y);
			System.out.println(arr[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println(arr[3]);
		}
		catch (ArithmeticException e) {
			y=2;
			System.out.println(x/y);
		}
		catch(Exception e) {
			System.out.println("I can handle all");
		}
		finally {
			sc.close();
			System.out.println("Clean-up code");
		}
		
		System.out.println("Hi");

	}

}
