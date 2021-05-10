package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
		
	}
	public static void method1() {
	Scanner sc = new Scanner(System.in);
	try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid Position!");
	}
	catch (InputMismatchException e) {
		System.out.println("Input error");
		e.printStackTrace();
		//sc.next();
		String End = sc.next();
		System.out.println(End);
	}
	finally {
		sc.close();
	}
	}



}

