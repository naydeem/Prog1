package prog1;

import javax.swing.JOptionPane;

public class medel {
/*	Skriv ett Java-program som ber användaren att mata in 
	tre heltal och sedan räkna ut och 
	skriva ut medelvärdet av dessa tal.
*/
public static void main(String[] args) {
	
	String nummer1 = JOptionPane.showInputDialog("Nummer 1");

	double tal1 = Integer.parseInt(nummer1);
	
	String nummer2 = JOptionPane.showInputDialog("Nummer 2");

	int tal2 = Integer.parseInt(nummer2);
	
	String nummer3 = JOptionPane.showInputDialog("Nummer 3");

	int tal3 = Integer.parseInt(nummer3);
	
	double nummer4 = tal1+tal2+tal3;
	double svar = nummer4/3;

	System.out.println("medelvärdet av de 3 nummer är "+svar);
}
}
