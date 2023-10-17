package prog1;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("ange namn");
		
		String namn=input.nextLine();
				
		System.out.println("Hur gammal är du");
		
		int ålder=input.nextInt();
				
		System.out.println("Yo, " + "du heter " + namn + " och är " + ålder + " år gammal >;)");
	}
}
