package grafik;

import java.awt.*; 
import javax.swing.*;


public class HelloWorld extends JFrame {

	
	JLabel text = new JLabel("Hello World");
	JButton knapp = new JButton("Change text");
	
	
	public HelloWorld() {
		
		this.setVisible(true);
		this.setSize(new Dimension(500,500));
		this.setLayout(new FlowLayout());
		this.add(text);
		this.add(knapp);
		
		knapp.addActionListener(e->{
		
			text.setText("ny text");
		});
		
		
	}
	
	
	
	public static void main(String[] args) {
	
		new HelloWorld();
		
	}
}
