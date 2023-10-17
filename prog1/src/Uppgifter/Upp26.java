package Uppgifter;
import java.util.Scanner;
public class Upp26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ange belopp");
		double belopp= input.nextDouble();
		
		int belopp1 = (int)(belopp/100);
		int belopp2 = belopp1+1;
		int uttag = belopp2*100;
		
		int f = uttag/500;
		int e = (uttag/100)-1;
		int f1 = f*5;	
		int e1= e-f1;
		
		System.out.println("femhundra lappar: " + f + "\nhundra lappar: "+ e1);

		}
}
