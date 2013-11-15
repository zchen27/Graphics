
import javax.swing.*;
import java.awt.event.*;

public class Riddle
{
	final static String QUESTION = "WHAT IS THE DIFFERENCE BETWEEN AN ENGLISH MAJOR AND A LARGE PIZZA?";
	final static String ANSWER = "A PIZZA CAN FEED A FAMILY OF FOUR";
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;
	
	public Riddle()
	{
		frame = new JFrame("RIDDLE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		label = new JLabel(QUESTION);
	}
}
