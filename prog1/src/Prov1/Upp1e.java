package Prov1;
import java.util.Scanner;
public class Upp1e {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Ange sida1");
		int Sida1= input.nextInt();
		System.out.println("Ange sida2");
		int Sida2= input.nextInt();
		
		int Area= Sida1*Sida2;
		
		System.out.println("Sida1: "+Sida1+" sida2: "+Sida2+" ger arean : "+Area);
	}
}
