import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BloodDrive implements KeyListener
{
	JFrame frame;
	JFrame graphFrame;
	JPanel panel;
	JPanel graph;
	JLabel department0 = new JLabel("STRUCTURAL DESIGN");
	JLabel department1 = new JLabel("BALLISTICS AND ROCKETRY");
	JLabel department2 = new JLabel("PROTOTYPE DESIGN");
	JLabel department3 = new JLabel("FORTIFICATION ENGINEERING");
	JLabel department4 = new JLabel("LOGISTICS");
	JTextField text0;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	
	double blood0;
	double blood1;
	double blood2;
	double blood3;
	double blood4;
	
	double scale;
	
	private class GraphPanel extends JPanel
	{
		@Override
		public void paintComponent(Graphics g)
		{
			int height = 500;
			int width = 1000;
			int xStart = 200;
			int yStart = 0;
			
			int length0 = (int) (blood0 / scale * width);
			int length1 = (int) (blood1 / scale * width);
			int length2 = (int) (blood2 / scale * width);
			int length3 = (int) (blood3 / scale * width);
			int length4 = (int) (blood4 / scale * width);
			
			super.paintComponent(g);
			g.setColor(Color.black);
			g.drawLine(xStart, yStart, xStart, height);
			g.drawLine(xStart, height, (width + xStart), height);
			g.drawString("DEPARTMENT", 0, height/20);
			
			g.setColor(Color.black);
			g.drawString(department0.getText(), 0, height / 10);
			g.setColor(Color.red);
			g.drawLine(xStart, height/10, (xStart + length0), height / 10);
			
			g.setColor(Color.black);
			g.drawString(department1.getText(), 0, 3 * height / 10);
			g.setColor(Color.red);
			g.drawLine(xStart, 3 * height / 10, (xStart + length1), 3 * height / 10);
			
			g.setColor(Color.black);
			g.drawString(department2.getText(), 0, 5 * height / 10);
			g.setColor(Color.red);
			g.drawLine(xStart, 5 * height / 10, (xStart + length2), 5 * height / 10);
			
			g.setColor(Color.black);
			g.drawString(department3.getText(), 0, 7 * height / 10);
			g.setColor(Color.red);
			g.drawLine(xStart, 7 * height / 10, (xStart + length3), 7 * height / 10);
			
			g.setColor(Color.black);
			g.drawString(department4.getText(), 0, 9 * height / 10);
			g.setColor(Color.red);
			g.drawLine(xStart, 9 * height / 10, (xStart + length4), 9 * height / 10);
		}
	}
	
	public BloodDrive()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		graphFrame = new JFrame();
		graphFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		
		graph = new GraphPanel();
		graph.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		panel.add(new JLabel("DEPARTMENT:"));
		
		panel.add(new JLabel(""));
		
		panel.add(department0);
		
		text0 = new JTextField();
		text0.setBackground(Color.pink);
		text0.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(text0);
		
		panel.add(department1);
		
		text1 = new JTextField();
		text1.setBackground(Color.magenta);
		text1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(text1);
		
		panel.add(department2);
		
		text2 = new JTextField();
		text2.setBackground(Color.pink);
		text2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(text2);
		
		panel.add(department3);
		
		text3 = new JTextField();
		text3.setBackground(Color.magenta);
		text3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(text3);
		
		panel.add(department4);
		
		text4 = new JTextField();
		text4.setBackground(Color.pink);
		text4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		text4.addKeyListener(this);
		panel.add(text4);
		
		frame.add(panel);
		graphFrame.add(graph);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	@Override
	public void keyTyped(KeyEvent ke)
	{
		
	}

	@Override
	public void keyPressed(KeyEvent ke)
	{

	}

	@Override
	public void keyReleased(KeyEvent ke)
	{
		if(ke.getKeyCode() == KeyEvent.VK_ENTER)
		{
			blood0 = Double.parseDouble(text0.getText());
			blood1 = Double.parseDouble(text1.getText());
			blood2 = Double.parseDouble(text2.getText());
			blood3 = Double.parseDouble(text3.getText());
			blood4 = Double.parseDouble(text4.getText());
			setScale();
			graphFrame.pack();
			graphFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			graphFrame.setVisible(true);
			graphFrame.repaint();
		}
	}
	
	private void setScale()
	{
		double max = 0;
		double[] values = {blood0, blood1, blood2, blood3, blood4};
		for(int i = 0; i < values.length; i++)
		{
			if(values[i] > max)
			{
				max = values[i];
			}
		}
		assert(max != 0);
		scale = max;
	}
	
	private static void runBloodDrive()
	{
		BloodDrive bloodDrive = new BloodDrive();
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runBloodDrive();
			}
		};
		
		javax.swing.SwingUtilities.invokeLater(run);
	}
}
