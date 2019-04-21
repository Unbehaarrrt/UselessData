package LukasPackage;
import javax.swing.*;
public class tAusfuerung {

	public static void main(String[] args) {

		Taschencalc1 Taschenrechner = new Taschencalc1();
		Taschenrechner.setx(3);
		Taschenrechner.sety(5);
		JOptionPane.showMessageDialog(null, "Ergenis ist " + Taschenrechner.divi());
		
		
	}

}
