package Ovn;
import java.util.Scanner;
public class Ovn28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ange stor bokstav");
		
		String Stor=input.nextLine();	
		
		int lite=Stor.charAt(0)+32;
		
		
		char lite2= (char)lite;

//		System.out.println("litet "+Stor+" blir "+lite2);  
		System.out.println(Stor);
	}
}
