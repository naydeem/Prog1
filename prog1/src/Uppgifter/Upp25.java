package Uppgifter;
import java.util.Scanner;
public class Upp25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ange en tal");
		
		double Tal = input.nextDouble();
		
		double Tal1 = Tal+0.5;
		int Tal2 = (int)Tal1;
		
		System.out.println(Tal2);
		
	}
}
