package Ovn;

import java.util.Scanner;

public class Ovn22 {
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
	
	System.out.println("ge ett nummer");
	
	double tal=input.nextDouble();
	
	double svar = Math.pow(tal, 2);
			
			System.out.println("kvadraten på "+tal+" är "+svar);
	}
}
