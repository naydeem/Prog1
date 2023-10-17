package Prov1;
import java.util.Scanner;
public class Upp2c {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Ange mail adress");
		String mail= input.nextLine();
		
		int pos1=mail.indexOf(".");
		int pos2=mail.indexOf("@");
		String p=mail.substring(pos2+1);
		int pos3=p.indexOf(".");
		
		
		String sur=mail.substring(0,pos1);
		String last=mail.substring(pos1+1,pos2);
		String dom=p.substring(0,pos3);
		System.out.println("domän: "+dom+"\nFörnamn: "+sur+"\nefternamn: "+last);
		
		
	}
}
