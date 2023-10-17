package Uppgifter;
import java.util.Scanner;
public class Upp22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ange ordet på svenska");
		
		String sv = input.nextLine();
		
		System.out.println("Ange ordet på engelska");
		
		String en = input.nextLine();
		
		System.out.println(sv+" heter "+en+" på engelska");
		
	}
}
