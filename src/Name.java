import javax.swing.*;
import java.awt.event.*;

public class Name implements ActionListener
{
	final static String LABEL = "ZHEHAO CHEN";
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;

	public Name()
	{
		frame = new JFrame("NAME");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		
		label = new JLabel(LABEL);
		label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(label);
		
		button = new JButton("Hide");
		button.addActionListener(this);
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(button);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		String eventName = ae.getActionCommand();
		
		if(eventName.equals("Hide"))
		{
			label.setText("");
			button.setText("Show");
			button.setActionCommand("Show");
		}
		else
		{
			label.setText(LABEL);
			button.setText("Hide");
			button.setActionCommand("Hide");
		}
	}
	
	private static void runName()
	{
		Name name = new Name();
	}
	
	public static void main(String[] args)
	{
		javax.swing.SwingUtilities.invokeLater(
		new Runnable()
		{
			public void run()
			{
				runName();
			}
		});
	}
}
