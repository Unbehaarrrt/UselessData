package LukasPackage;

import javax.swing.*;

public class Number {
	private float Zahl;

	public float Gegenzahl() {
		return -this.Zahl;
	}

	public float Kehrwert() {
		return 1 / this.Zahl;
	}
	
	public void setZahl(float z) {
		this.Zahl=z;
	}
	
	public float getZahl() {
		return this.Zahl;
	}
	
	public void anzeigen(String Text, float z) {
		JOptionPane.showMessageDialog(null, Text + " ist " + z);
	}

}
