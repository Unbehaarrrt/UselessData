package LukasPackage;
import javax.swing.*;
	
public class LukasKlasse {

	public static void main(String[] args) {
		
		String Question = JOptionPane.showInputDialog("How are you?");
		
		if (Question.equals("gerai"))
			JOptionPane.showMessageDialog(null, "Tu man patinki");
		
		if (Question.equals("blogai"))
			JOptionPane.showInputDialog("Kodël?");
		
		if (Question.equals("normaliai"))
			JOptionPane.showInputDialog("Tai puiku");
		}
		
	}

