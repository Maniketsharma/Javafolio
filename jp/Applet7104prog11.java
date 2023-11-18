import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Applet7104prog11 extends Applet {
    /*
     * Topic = Applet
     * prog.no 11 Java Program to change background color in applet.
     */
    public Applet7104prog11() {
        setBackground(Color.red);
    }

    public void paint(java.awt.Graphics g) {

        g.drawString("Background Color Changed", 50, 50);
    }
    /*
     * <applet code="Applet7104prog11.class" width="300" height="300">
     * </applet>
     */
}