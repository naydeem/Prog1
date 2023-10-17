package Ovn;
import java.util.Scanner;

public class Ovn24 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
 
	System.out.println("ange nummer 1");
	
	int nummer1=input.nextInt();	
	
	System.out.println("ange nummer 2");
	
	int nummer2=input.nextInt();	

	System.out.println("ange nummer 3");
	
	int nummer3=input.nextInt();	

	
	int summan = nummer1 + nummer2 + nummer3;
	
	double medel= (nummer1+nummer2+nummer3)/ 3.0;
	
	System.out.println("summan är "+summan+ " och medelvärdet är "+medel);


  }
}
