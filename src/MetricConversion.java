import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MetricConversion
{
	final static String PROMPT = "SELECT A CONVERSION TYPE";
	final static String IN_CM = "inches to centimeters";
	final static String FT_M = "feet to meters";
	final static String GL_L = "gallons to liters";
	final static String LB_KG = "pounds to kilograms";
	final static double ICFACTOR = 2.54;
	final static double FMFACTOR = 0.3048;
	final static double GLFACTOR = 4.5461;
	final static double LKFACTOR = 0.4536;
	
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
		
	}
}
