package Ovn;
import java.util.Scanner;
public class Ovn25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ange namn");
			
		String namn=input.nextLine();	

		String initial=namn.substring(0,1);
		
		int a=namn.indexOf(" ");
		
		
		String initial2=namn.substring(a+1,a+2);


	System.out.println(namn+" har initialerna "+initial+"."+initial2);
		
	}
}
