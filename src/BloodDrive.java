import java.awt.*;
import java.awt.event.*;
import java.math.*;
import javax.swing.*;

public class BloodDrive implements KeyListener
{
	JFrame frame;
	JFrame graphFrame;
	JPanel panel;
	JPanel graph;
	JLabel department0 = new JLabel("BALLISTICS AND ROCKETRY");
	JLabel department1 = new JLabel("MATERIALS ENGINEERING");
	JLabel department2 = new JLabel("STRUCTURAL SYSTEMS");
	JLabel department3 = new JLabel("FORTIFICATIONS");
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
			int height = 250;
			int width = 1000;
			
			int length0 = (int) (blood0 / scale * width);
			int length1 = (int) (blood1 / scale * width);
			int length2 = (int) (blood2 / scale * width);
			int length3 = (int) (blood3 / scale * width);
			int length4 = (int) (blood4 / scale * width);
			
			super.paintComponent(g);
			g.drawLine(0, 0, 0, height);
			g.drawLine(0, height, width, height);
		}
	}
	
	public BloodDrive()
	{
		frame = new JFrame();
		
		graphFrame = new JFrame();
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		
		graph = new GraphPanel();
		graph.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		panel.add(department0);
		
		text0 = new JTextField();
		text0.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(text0);
		
		panel.add(department1);
		
		text1 = new JTextField();
		text1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(text1);
		
		panel.add(department2);
		
		text2 = new JTextField();
		text2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(text2);
		
		panel.add(department3);
		
		text3 = new JTextField();
		text3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(text3);
		
		panel.add(department4);
		
		text4 = new JTextField();
		text4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		text4.addKeyListener(this);
		panel.add(text4);
		
		frame.add(panel);
		graphFrame.add(graph);
	}
	
	@Override
	public void keyTyped(KeyEvent ke)
	{
		if(ke.getKeyCode() == KeyEvent.VK_ENTER)
		{
			blood0 = Double.parseDouble(text0.getText());
			blood1 = Double.parseDouble(text1.getText());
			blood2 = Double.parseDouble(text2.getText());
			blood3 = Double.parseDouble(text3.getText());
			blood4 = Double.parseDouble(text4.getText());
			setScale();
		}
	}

	@Override
	public void keyPressed(KeyEvent ke)
	{
		//throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void keyReleased(KeyEvent ke)
	{
		//throw new UnsupportedOperationException("Not supported yet.");
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
}
