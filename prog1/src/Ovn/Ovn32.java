package Ovn;
import java.util.Scanner;
import java.util.Arrays;
public class Ovn32 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int[] i = new int[3];
		
		System.out.println("Ange siffer");
		i[0] =input.nextInt(); 
		
		System.out.println("Ange siffer");
		i[1] =input.nextInt(); 
		
		System.out.println("Ange siffer");
		i[2] =input.nextInt(); 
		
		int temp= i[0];
		 
		 i[0] = i[2];
		 
		 i[2] = temp; 
		System.out.println(Arrays.toString(i));
		
		
		
	}
}
