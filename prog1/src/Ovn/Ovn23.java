package Ovn;
import java.util.Scanner;

public class Ovn23 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("ange din ålder");
	
	int ålder=input.nextInt();	
	double ålder1 = ålder/10;
	int ålder2 = (int)(ålder1 + 1);
	int ålder3 = ålder2*10;
	int ålder4 = ålder3-ålder;
	System.out.println("du fyller "+ålder3+ " om "+ ålder4+ " år" );
	
	
	
}
}
