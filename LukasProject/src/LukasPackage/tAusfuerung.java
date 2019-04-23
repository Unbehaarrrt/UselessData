package LukasPackage;

import javax.swing.*;

public class tAusfuerung {

	public static void main(String[] args) {

		Taschencalc1 Taschenrechner = new Taschencalc1();
		
		String Eingabe = JOptionPane.showInputDialog("Tippe eine Nummer ein: ");
		String Eingabe1 = JOptionPane.showInputDialog("Noch eine: ");
		String Operator = JOptionPane.showInputDialog("Und noch einen Operator: ");
		
		float Zahl = Float.parseFloat(Eingabe);
		float Zahl1 = Float.parseFloat(Eingabe1);
		
		Taschenrechner.setx(Zahl);
		Taschenrechner.sety(Zahl1);
		
		switch (Operator) {

			case "+":
					JOptionPane.showMessageDialog(null, Taschenrechner.addi());
			case "-":
					JOptionPane.showMessageDialog(null, Taschenrechner.subtrack());
			case "/":
					JOptionPane.showMessageDialog(null, Taschenrechner.divi());
			case "*":
					JOptionPane.showMessageDialog(null, Taschenrechner.multi());
		}

	}

}
