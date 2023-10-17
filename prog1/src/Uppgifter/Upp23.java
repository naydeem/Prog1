package Uppgifter;
import java.util.Scanner;
public class Upp23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ange Substantiv");
		
		String sub = input.nextLine();
		
		System.out.println("Ange pluraländelse");
		
		String plu = input.nextLine();
		
		System.out.println("En "+sub+", flera "+sub+plu);
	}
}
