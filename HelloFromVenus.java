package Basics;
import java.awt.*;
import java.applet.Applet;

public class HelloFromVenus extends Applet{
	public void paint(Graphics g){
		Dimension d = getSize();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, d.width, d.height);
		g.setFont(new Font("Sans-serif", Font.BOLD,24));
		g.setColor(new Color(255, 215, 0)); //gold color
		g.drawString("Hello from Venus!", 40, 25);
		g.drawImage(getImage((getCodeBase()),"Venus.gif"), 20, 60, this);
		
	}
}
