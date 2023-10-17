package Uppgifter;
import java.util.Scanner;
public class Upp21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange bas");
		double bas = input.nextInt();
		
		System.out.println("Ange höjd");
		double hojd = input.nextInt();
	
		double area = bas*hojd;
		double area1 =area/2;
		System.out.println("arean på denna rektangeln är "+area1);
		
		
		
		
		
	}
}
