package Uppgifter;
import java.util.Scanner;
public class Upp24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ange Teckenkod");
		
		int kod=input.nextInt();	
		
		char bokstav=(char)kod;

		System.out.println("teckenkoden "+kod+" ger tecknet "+bokstav);
	}
}
