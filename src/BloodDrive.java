import java.awt.*;
import java.awt.event.*;
import java.math.*;
import javax.swing.*;

public class BloodDrive implements ActionListener
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
	
	BigDecimal blood0;
	BigDecimal blood1;
	BigDecimal blood2;
	BigDecimal blood3;
	BigDecimal blood4;
	
	BigDecimal scale;
	
	private class GraphPanel extends JPanel
	{
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
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
		
		panel.add(department0);
		
		text0 = new JTextField();
		text0.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		text0.addActionListener(this);
		panel.add(text0);
		
		panel.add(department1);
		
		text1 = new JTextField();
		text1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		text1.addActionListener(this);
		panel.add(text1);
		
		panel.add(department2);
		
		text2 = new JTextField();
		text2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		text2.addActionListener(this);
		panel.add(text2);
		
		panel.add(department3);
		
		text3 = new JTextField();
		text3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		text3.addActionListener(this);
		panel.add(text3);
		
		panel.add(department4);
		
		text4 = new JTextField();
		text4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		text4.addActionListener(this);
		panel.add(text4);
		
		frame.add(panel);
		graphFrame.add(graph);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
