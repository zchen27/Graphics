import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MetricConversion implements ActionListener
{
	final static String PROMPT = "SELECT A CONVERSION TYPE";
	final static String[] CHOICES = {"inches to centimeters", "feet to meters", "gallons to liters", "pounds to kilograms"};
	final static String[] FACTOR = {"1 INCH = 2.54 CENTIMETERS", "1 FOOT = 0.304 METERS", "1 GALLON = 4.5461 LITERS" , "1 POUND = 0.4536 KILOGRAMS"};
	
	JFrame frame;
	JPanel panel;
	JLabel prompt;
	JLabel response;
	JComboBox comboBox;
	
	public MetricConversion()
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
		comboBox.addActionListener(this);
		comboBox.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(comboBox);
		
		response = new JLabel("");
		response.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(response);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		JComboBox box = (JComboBox) ae.getSource();
		String conversion = (String) box.getSelectedItem();
		
		for(int i = 0; i < CHOICES.length; i++)
		{
			if(conversion.equals(CHOICES[i]))
			{
				response.setText(FACTOR[i]);
			}
		}
	}
	
	private static void runMetricConversion()
	{
		JFrame.setDefaultLookAndFeelDecorated(false);
		MetricConversion metricConversion = new MetricConversion();
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
				@Override
				public void run()
				{
					runMetricConversion();
				}
		};
		
		javax.swing.SwingUtilities.invokeLater(run);
	}
}
