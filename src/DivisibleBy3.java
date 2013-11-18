import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DivisibleBy3 implements ActionListener
{
	final static String PROMPT= "ENTER AN INTEGER";
	final static String YES = " DIVISIBLE BY 3";
	final static String NO = " NOT DIVISIBLE BY 3";
	
	JFrame frame;
	JPanel panel;
	JButton button;
	JLabel prompt;
	JLabel response;
	JTextField field;

	public DivisibleBy3()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		
		prompt = new JLabel(PROMPT);
		prompt.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(prompt);
		
		field = new JTextField(20);
		field.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(field);
		
		button = new JButton("Check");
		button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(button);
		
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
		String eventName = ae.getActionCommand();
		if(eventName.equals("Check"))
		{
			if(Integer.parseInt(field.getText()) % 3 != 0)
			{
				response.setText(NO);
			}
			else
			{
				response.setText(YES);
			}
		}
		else
		{
			
		}
	}
	
	private static void runDivisibleBy3()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		DivisibleBy3 divisibleBy3 = new DivisibleBy3();
	}
	
	public static void main(String[] s)
	{
		Runnable run = new Runnable()
		{
				public void run()
				{
					runDivisibleBy3();
				}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}

}
