// GraphicsLab1
// The AWT Graphics Program
// This is the student, starting version of GraphicsLab1


import java.awt.*;
import javax.swing.*;

public class GraphicsLab1
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
		MyPanel m = new MyPanel();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

		j.setVisible(true); //allows the frame to be shown.

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

}

class MyPanel extends JPanel 
{
	MyPanel()
	{
		setSize(800, 600);
		setVisible(true); //it's like calling the repaint method.
	}
	
	public void paintComponent(Graphics g)
	{
		// DRAW CUBE
		g.drawRect(20,20,100,100);
		g.drawRect(50,50,100,100);

		g.drawLine(20, 20, 50, 50);
		g.drawLine(120, 20, 150, 50);

		g.drawLine(20, 120, 50, 150);
		g.drawLine(120, 120, 150, 150);


		// DRAW SPHERE
		int things = 4;
		int size = 100;
		int x = 85;
		int y = 85;

		int inc = size/things;

		for (int i = 0; i < things; i++)
		{
			g.drawOval(x-size/2, y-inc*(i+1)/2, size, inc*(i+1));
			g.drawOval(x-inc*(i+1)/2, y-size/2, inc*(i+1), size);
		}


		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
		int cx = 350;
		int cy = 350;
		int cSize = 100;
		g.drawOval(cx-cSize/2, cy-cSize/2, cSize, cSize);

		g.drawLine(cx-cSize/2, cy, cx, cy+cSize/2);
		g.drawLine(cx-cSize/2, cy,  (int) (cx+ .707*cSize/2), (int) (cy - .707*cSize/2));
		g.drawLine(cx, cy+cSize/2,  (int) (cx+ .707*cSize/2), (int) (cy - .707*cSize/2));
		g.drawOval(cx-32, cy-16, 46, 46);


		// DRAW APCS
		int fontSize = 20;

		// A
		g.fillRect(400, 100, 1*fontSize, 5*fontSize);
		g.fillRect(440, 100, 1*fontSize, 5*fontSize);
		g.fillRect(400, 100, 3*fontSize, 1*fontSize);
		g.fillRect(400, 140, 3*fontSize, 1*fontSize);

		// P
		g.fillRect(480, 100, 1*fontSize, 5*fontSize);
		g.fillRect(480, 100, 3*fontSize, 1*fontSize);
		g.fillRect(480, 140, 3*fontSize, 1*fontSize);
		g.fillRect(520, 100, 1*fontSize, 3*fontSize);

		// C
		g.fillRect(560, 100, 1*fontSize, 5*fontSize);
		g.fillRect(560, 100, 3*fontSize, 1*fontSize);
		g.fillRect(560, 180, 3*fontSize, 1*fontSize);

		// S
		g.fillRect(640, 100, 3*fontSize, 1*fontSize);
		g.fillRect(640, 140, 3*fontSize, 1*fontSize);
		g.fillRect(640, 180, 3*fontSize, 1*fontSize);
		g.fillRect(640, 100, 1*fontSize, 3*fontSize);
		g.fillRect(680, 140, 1*fontSize, 3*fontSize);

		// DRAW PACMEN FLOWER
		g.fillArc(200, 400, 50, 50, 45, 360-90);
		g.fillArc(170, 430, 50, 50, -45, 360-90);
		g.fillArc(170, 370, 50, 50, 135, 360-90);
		g.fillArc(140, 400, 50, 50, 225, 360-90);
	}
}

