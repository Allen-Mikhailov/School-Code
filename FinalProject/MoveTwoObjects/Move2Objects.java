package MoveTwoObjects;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class Move2Objects
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
		MyPanelb m = new MyPanelb();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

		j.setVisible(true); //allows the frame to be shown.

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

}

class MyPanelb extends JPanel implements ActionListener
{
	
	private Timer time;
	private int obj1x = 300, obj1y =100;
	private int obj2x = 100, obj2y =200;

	private Image Object2;
	
	MyPanelb()
	{
		// getting the image for Obj2
		try
		{
			Object2 = ImageIO.read(new File("Object2.jpg"));
		}
		catch(Exception e)	{}


		time = new Timer(15, this); //sets delay to 15 millis and calls the actionPerformed of this class.
		setSize(1000, 800);
		setVisible(true); //it's like calling the repaint method.
		time.start();
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(0,0,2000,1500);


		// moving object 1
		obj1y += 1;

		// moving object 2
		obj2x += 1;
		obj2y += 1;

		drawObj1(g,obj1x,obj1y);

		drawObj2(g,obj2x,obj2y);
		
	}
	
	public void drawObj1(Graphics g, int x, int y)
	{
		g.setColor(Color.BLACK);
		//head
		g.drawOval(300 + x,y,100,100);
		g.setColor(Color.RED);
		g.drawOval(325 + x,y+20,20,20);   //left eyes
		g.setColor(Color.GREEN);
		g.fillOval(330 + x,y+30,10,10);
		
		g.setColor(Color.BLACK);
	}

	public void drawObj2(Graphics g, int x, int y)
	{
		g.drawImage(Object2, x, y, null);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
				
			
		repaint();  // call to paintComponent
	}
	
}