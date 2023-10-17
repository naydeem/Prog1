package Prov1;
import java.util.Scanner;
public class Upp1c {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Ange täljare");
		int tel= input.nextInt();
		
		System.out.println("Ange nämnare");
		int nam= input.nextInt();
		
		int hel= tel/nam;
		
		
		int hel2= (int)tel-nam;
		
		
		System.out.println("Svar: "+hel+" hel och "+hel2+"/"+nam);
		
	}
}
