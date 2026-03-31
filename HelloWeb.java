/* HelloWeb.java
   A very basic Applet*/ 

import java.awt.Graphics;
import javax.swing.JApplet;
 
public class HelloWeb extends JApplet { 

    public void paint(Graphics g) {

    g.drawString("Hello, World Wide Web!", 10, 50);

    }//end paint

}//end class 