package LukasPackage;

import javax.swing.*;

public class Trinkspiel {

	public static void main(String[] args) {

		String Antwort = JOptionPane.showInputDialog("Moechtest du spielen? ja/nein");

		if (Antwort.equals("ja"))
			JOptionPane.showMessageDialog(null, "loading informations...");

		if (Antwort.equals("nein")) {
			JOptionPane.showMessageDialog(null, "Dann bein naechstn mal");
			System.exit(0);
		}
		
		String frage1 = JOptionPane.showInputDialog("Hast du schonmal geatmet");
		
		
		if (frage1.equals("ja"))
			JOptionPane.showMessageDialog(null, "TRINK");
		
		if (frage1.equals("nein"))
			JOptionPane.showMessageDialog(null, "Naechste Frage");

		
	}

}
