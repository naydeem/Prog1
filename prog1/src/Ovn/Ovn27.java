package Ovn;
import java.util.Scanner;
public class Ovn27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ange Tecken");
		
		String bokstav=input.nextLine();	
		
		int C=bokstav.charAt(0);

		System.out.println("Tecknet "+bokstav+" har teckenkoden "+C);
	}
}
