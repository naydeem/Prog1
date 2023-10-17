package Ovn;

import java.util.Arrays;
import java.util.Scanner;

public class Ovn31 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int [] tid = new int[4];
		
		System.out.println("Ange siffer");
		tid[0] =input.nextInt(); 
		
		System.out.println("Ange siffer");
		tid[1] =input.nextInt(); 
		
		System.out.println("Ange siffer");
		tid[2] =input.nextInt(); 
		
		System.out.println("Ange siffer");
		tid[3] =input.nextInt(); 
		
		System.out.println("fältet innehåller "+Arrays.toString(tid));

	}
}

