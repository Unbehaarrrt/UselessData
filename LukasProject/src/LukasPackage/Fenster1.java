package LukasPackage;
import javax.swing.*;
import java.awt.*;

public class Fenster1 {

	public static void main(String[] args) {

		 JFrame Rahmen = new JFrame("Hallo wie gehts? ");
		
		Rahmen.setSize(400,300);
		Rahmen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Platte = new JPanel();
		
		Platte.add(new JButton ("Gut"));
		Platte.add(new JButton ("Schlecht"));
		Platte.setLayout(new GridLayout());
		Rahmen.setContentPane(Platte);
		Rahmen.setVisible(true);
	
	}

}
