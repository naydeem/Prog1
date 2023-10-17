package Operatorer;

public class TidsOmvandling {
	public static void main(String[] args) {
		
		int sekunder= 3666;
		
		int Timmar = sekunder/3600;
		int restTimmar = sekunder%3600;
		
		//int restTimmar = sekunder-(Timmar*sekunder); det är samma sak liksom...
		
		
		int Minuter = restTimmar/60;
		int sekunders = restTimmar%60;

		
		System.out.println(sekunder+" sekunder är "+Timmar+" timmar och " +Minuter+" minuter och "+sekunders+ " sekunder"); 
		
	}
}
