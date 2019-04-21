package LukasPackage;
import javax.swing.*;
	
public class password {

	public static void main(String[] args) {

		String Password = JOptionPane.showInputDialog("Password required:");
		if (Password.equals("123"))
			JOptionPane.showMessageDialog(null, "Passwod right");
		
		else {
			
			JOptionPane.showMessageDialog(null, "Password wrong");
			System.exit(0);
		}
		
		
		
	}

}
