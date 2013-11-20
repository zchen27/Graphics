import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Roll implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JLabel die0;
	JLabel die1;
	JButton roll0;
	JButton roll1;
	JButton rollboth;
	
	public Roll()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		panel.setLayout(new GridLayout(0, 2));
		panel.setBackground(Color.lightGray);
		
		die0 = new JLabel(new ImageIcon("die1.gif"));
		die0.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(die0);
		
		die1 = new JLabel(new ImageIcon("die1.gif"));
		die1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.add(die1);
		
		roll0 = new JButton("Roll First Die");
		roll0.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		roll0.setBackground(Color.green);
		roll0.setForeground(Color.red);
		panel.add(roll0);
		
		roll1 = new JButton("Roll Second Die");
		roll1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		roll1.setBackground(Color.blue);
		roll1.setForeground(Color.yellow);
		panel.add(roll1);
		
		rollboth = new JButton("Roll Both Dice");
		rollboth.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		rollboth.setBackground(Color.darkGray);
		rollboth.setForeground(Color.magenta);
		panel.add(rollboth);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		String eventName = ae.getActionCommand();
		Random random = new Random();
		int face0 = -1;
		int face1 = -1;
		if(eventName.equals("Roll First Die"))
		{
			face0 = random.nextInt(6) + 1;
			setDie0(face0);
		}
		else if(eventName.equals("Roll Second Die"))
		{
			face1 = random.nextInt(6) + 1;
			setDie1(face1);
		}
		else if(eventName.equals("Roll Both Dice"))
		{
			face0 = random.nextInt(6) + 1;
			setDie0(face0);
			face1 = random.nextInt(6) + 1;
			setDie1(face1);
		}
		else
		{
			throw new UnsupportedOperationException("WHAT ARE YOU DOING?");
		}
	}
	
	private void setDie0(int face)
	{
		switch(face)
			{
				case '1':
					die0.setIcon(new ImageIcon("die1.gif"));
					break;
				case '2':
					die0.setIcon(new ImageIcon("die2.gif"));
					break;
				case '3':
					die0.setIcon(new ImageIcon("die3.gif"));
					break;
				case '4':
					die0.setIcon(new ImageIcon("die4.gif"));
					break;
				case '5':
					die0.setIcon(new ImageIcon("die5.gif"));
					break;
				default:
					throw new UnsupportedOperationException("WHAT ARE YOU DOING?");
			}
	}
	
	private void setDie1(int face)
	{
		switch(face)
			{
				case '1':
					die1.setIcon(new ImageIcon("die1.gif"));
					break;
				case '2':
					die1.setIcon(new ImageIcon("die2.gif"));
					break;
				case '3':
					die1.setIcon(new ImageIcon("die3.gif"));
					break;
				case '4':
					die1.setIcon(new ImageIcon("die4.gif"));
					break;
				case '5':
					die1.setIcon(new ImageIcon("die5.gif"));
					break;
				default:
					throw new UnsupportedOperationException("WHAT ARE YOU DOING?");
			}
	}
	
	private static void runRoll()
	{
		JFrame.setDefaultLookAndFeelDecorated(false);
		Roll roll = new Roll();
	}
	
	public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runRoll();
			}
		};
		javax.swing.SwingUtilities.invokeLater(run);
	}
	
}
