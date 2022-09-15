// GraphicsLab02.java
// Student starting version of the GraphicsLab02 assignment.
// Resave this program as GraphicsLab0280 for the 80 point version.
// Repeat this process as you progress to the 90 and 100 point versions.
// 80 Point Version. Your program has one class with three or more methods.
// 90 Point Version. Your program has one class with three or more methods.It has a second class with two or more methods.
// 100 Point Version. Your program has one class with three or more methods.It has a second class with two or more methods.
//                    It has a third class with one or more methods.



import java.awt.*;
import javax.swing.*;

public class GraphicsLab02
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
		// Background
		Background.Draw(g);

		// Tree
		Tree.DrawTrunk(g);
		Tree.DrawLeaves(g);

		// House
		House.DrawBase(g);
		House.DrawRoof(g);
		House.DrawWindows(g);
	}

}

class Background
{
	public static void Draw(Graphics g)
	{
		g.setColor(new Color(71, 142, 209));
		g.fillRect(0, 0, 800, 300);
		g.setColor(Color.green);
		g.fillRect(0, 300, 800, 300);
	}
}

class Tree 
{
	public static void DrawLeaves(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.fillOval(600, 150, 100, 100);
	}

	public static void DrawTrunk(Graphics g)
	{
		g.setColor(new Color(61, 38, 10));
		g.fillRect(640, 200, 20, 125);
	}
}

class House
{
	public static void DrawBase(Graphics g)
	{
		g.setColor(new Color(209, 145, 96));
		g.fillRect(50, 250, 200, 100);

		// Door
		g.setColor(new Color(92, 69, 51));
		g.fillRect(135, 300, 30, 50);
	}

	public static void DrawRoof(Graphics g)
	{
		g.setColor(new Color(209, 101, 71));

		int[] xPoints = {50, 250, 150};
		int[] yPoints = {250, 250, 200};

		g.fillPolygon(xPoints, yPoints, 3);
		g.fillRect(200, 175, 20, 75);
	}

	public static void DrawWindows(Graphics g)
	{
		// Backgrounds
		g.setColor(Color.white);
		g.fillRect(60, 260, 40, 40);
		g.fillRect(200, 260, 40, 40);

		// Borders
		g.setColor(Color.BLACK);
		g.drawRect(60, 260, 40, 40);
		g.drawRect(200, 260, 40, 40);

		// Center Lines
		g.drawLine(60, 280, 100, 280);
		g.drawLine(80, 260, 80, 300);

		g.drawLine(200, 280, 240, 280);
		g.drawLine(220, 260, 220, 300);
	}
}






