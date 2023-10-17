package Ovn;
import java.util.Scanner;
public class Ovn26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("ange ditt hela namn med mellanslag");
		
		String namn=input.nextLine();	
		
		int posmellan=namn.indexOf(' ');
		
		String surnamn=namn.substring(0, posmellan);
		
		
		String efternamn=namn.substring(posmellan+1);

		System.out.println("Förnamn: " +surnamn);
		System.out.println("efternamn: "+efternamn);


	}

}
