import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MetricConversion
{
	final static String PROMPT = "SELECT A CONVERSION TYPE";
	final static String[] CHOICES = {"inches to centimeters", "feet to meters", "gallons to liters", "pounds to kilograms"};
	final static double ICFACTOR = {2.54, 0.304, 4.5461,0.4536};
	
	JFrame frame;
	JPanel panel;
	JLabel prompt;
	JLabel response;
	JComboBox comboBox;
	
	public void MetricConversio()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1));
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		
		prompt = new JLabel(PROMPT);
		prompt.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(prompt);
		
		comboBox = new JComboBox(CHOICES);
	}
}
