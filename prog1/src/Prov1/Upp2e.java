package Prov1;
import java.util.Scanner;
public class Upp2e {
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	
	System.out.println("Ange meningen");
	
	String mening= input.nextLine();
	int posmellan=mening.indexOf(" ");
	
	String first=mening.substring(0,posmellan);
	
	int antal=mening.length();
	
	System.out.println("Mening: "+mening+"\nFörsta ordet är: "+first+"\nMeningen består av "+antal+" tecken");
	
	}
}
