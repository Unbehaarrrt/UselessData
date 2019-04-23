package LukasPackage;
import javax.swing.*;

public class Schnelltest {

	public static void main(String[] args) {

		String Eingabe = JOptionPane.showInputDialog("Wie gehts?");
		if (Eingabe.equals("gut"))
			JOptionPane.showMessageDialog(null, "Das ist gut");
		if (Eingabe.equals("schlecht"))
			JOptionPane.showMessageDialog(null, "Das ist schade");
		
	}

}
