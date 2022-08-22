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


		// DRAW APCS



		// DRAW PACMEN FLOWER
		
	}
}

