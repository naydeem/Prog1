package Operatorer;

import java.util.Scanner;

public class Upp1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ange pris");
		int pris= input.nextInt();
		System.out.println("Ange belopp");
		int belopp= input.nextInt();

		int tillbaka= belopp-pris;		
		
		int tusen = tillbaka/1000;
			int rest= tillbaka%1000;
		
		int femhund= rest/500;	
			rest = rest%500;
			
		int etthund= rest/100;
			rest = rest%100;
			
		int femtio= rest/50;
			rest = rest%50;
			
		int tjugo= rest/20;
			rest= rest%20;
			
		int tio= rest/10;
			rest= rest%10;
			
		int fem= rest/5;
			rest= rest%5;
			
		int två= rest/2;
			rest= rest%2;
			
		int ett= rest/1;
			rest= rest%1;
		System.out.println("Tusen lappar: "+tusen+"\nFemhundra lappar: "+femhund+"\nEtthundra lappar: "+etthund
				+"\nFemtio lappar: "+femtio+"\nTjugo lappar: "+tjugo+"\nTio lappar: "+tio+"\nFem lappar: "+fem+"\nTvåor: "+två+"\nEttor: "+ett);
		
		
		
	}
}
