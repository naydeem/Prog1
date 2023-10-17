package EgenOvn;
import java.util.Scanner;
public class EgenOvn1 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		String e= input.nextLine();  //substring, the number of the letter in the word or sentence
		
		String i= e.substring(0,1); // this takes out the first letter from e
		
		int a=e.indexOf(" "); // this gives the number of the letter " " from e

		String i2= e.substring(a+1); // this gives the word after a from e
				
		System.out.println(i); 
		
	/*	String a=input.nextLine(); //char, from a number to a char
		
		int char1=a.charAt(0)+32;
		//int e= input.nextInt();
		
		//char e1=(char)e;
		char a1=(char)char1;
		System.out.println(a1); */
	}
}
