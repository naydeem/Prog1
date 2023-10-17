package prog1;

public class CharGenerator {
	public static void main(String[] args) {
		
		int slump = (int)(Math.random()*26)+65;
		
		char slumpchar= (char)slump;
		
		System.out.println(slumpchar);
	}
}
