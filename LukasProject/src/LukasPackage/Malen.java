package LukasPackage;
import javax.swing.*;
import java.awt.*;

public class Malen extends JFrame {

    public static void main(String[] args) {
    	Malen fenster = new Malen();
    }

    public Malen() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Zeichnen mit Java");
        setSize(400, 300);
        setVisible(true);
    }

    @Override // @Override ermöglicht dem Compiler die Kontrolle
    public void paint(Graphics g) {
        super.paint(g);
        Insets insets = getInsets();
        int originX = insets.left;
        int originY = insets.top;
        int breite   = getSize().width  - insets.left - insets.right;
        int hoehe   = getSize().height - insets.top  - insets.bottom;
        g.setColor(Color.yellow);
        g.fillOval(originX, originY, breite-1, hoehe-1);
        g.setColor(Color.black);
        String meldung  = "" + breite + " x " + hoehe + " Pixel";
        g.drawString(meldung, breite/2, hoehe/2);
        g.drawLine(100,100,200,200);
    }
}



