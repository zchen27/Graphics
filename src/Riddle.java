
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Riddle implements ActionListener
{
	final static String QUESTION = "WHAT IS THE DIFFERENCE BETWEEN AN ENGLISH MAJOR AND A LARGE PIZZA?";
	final static String ANSWER = "A PIZZA CAN FEED A FAMILY OF FOUR";
	
	JFrame frame;
	JPanel panel;
	JLabel labelQ;
	JLabel labelA;
	JButton button;
	
	public Riddle()
	{
		frame = new JFrame("RIDDLE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(0,2));
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		
		labelQ = new JLabel(QUESTION);
		labelQ.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		labelQ.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(labelQ);
		
		labelA = new JLabel("");
		labelA.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
		labelA.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(labelA);
		
		button = new JButton("Answer");
		button.addActionListener(this);
		button.setAlignmentX(JButton.CENTER_ALIGNMENT);
		button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(button);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		String eventName = ae.getActionCommand();
		
		if(eventName.equals("Answer"))
		{
			labelA.setText(ANSWER);
			button.setActionCommand("Hide");
			button.setText("Hide");
		}
		else
		{
			labelA.setText("");
			button.setActionCommand("Answer");
			button.setText("Answer");
		}
	}
	
	private static void runRiddle()
	{
		JFrame.setDefaultLookAndFeelDecorated(false);
		Riddle riddle = new Riddle();
	}
	
	public static void main(String[] s)
	{
		javax.swing.SwingUtilities.invokeLater
		(
			new Runnable()
			{
				public void run()
				{
					runRiddle();
				}
			}
		);
	}
}
