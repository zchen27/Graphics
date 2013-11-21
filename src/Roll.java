import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Roll implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JLabel die0;
	JLabel die1;
	JButton roll0;
	JButton roll1;
	JButton rollboth;
	static final String rollFirst = "Roll First Die";
	static final String rollSecond = "Roll Second Die";
	static final String rollBoth = "Roll Both Dice";
	private Color[] backgrounds = {Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green, Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.red, Color.white, Color.yellow};
	
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
		die0.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel.add(die0);
		
		die1 = new JLabel(new ImageIcon("die1.gif"));
		die1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		die1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		panel.add(die1);
		
		roll0 = new JButton(rollFirst);
		roll0.addActionListener(this);
		roll0.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		roll0.setBackground(Color.green);
		roll0.setForeground(Color.red);
		panel.add(roll0);
		
		roll1 = new JButton(rollSecond);
		roll1.addActionListener(this);
		roll1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		roll1.setBackground(Color.blue);
		roll1.setForeground(Color.yellow);
		panel.add(roll1);
		
		rollboth = new JButton(rollBoth);
		rollboth.addActionListener(this);
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
		Random random = new Random();
		String eventName = ae.getActionCommand();
		int face0 = -1;
		int face1 = -1;
		switch (eventName)
		{
			case rollFirst:
				face0 = random.nextInt(6) + 1;
				setDie0(face0);
				break;
			case rollSecond:
				face1 = random.nextInt(6) + 1;
				setDie1(face1);
				break;
			case rollBoth:
				face0 = random.nextInt(6) + 1;
				setDie0(face0);
				face1 = random.nextInt(6) + 1;
				setDie1(face1);
				break;
			default:
				break;
		}
		
		int i = random.nextInt(backgrounds.length - 1);
		Color nextColor = backgrounds[i];
		panel.setBackground(nextColor);
	}
	
	private void setDie0(int face)
	{
		switch(face)
			{
				case 1:
					die0.setIcon(new ImageIcon("die1.gif"));
					break;
				case 2:
					die0.setIcon(new ImageIcon("die2.gif"));
					break;
				case 3:
					die0.setIcon(new ImageIcon("die3.gif"));
					break;
				case 4:
					die0.setIcon(new ImageIcon("die4.gif"));
					break;
				case 5:
					die0.setIcon(new ImageIcon("die5.gif"));
					break;
				case 6:
					die0.setIcon(new ImageIcon("die6.gif"));
					break;
				default:
					break;
			}
	}
	
	private void setDie1(int face)
	{
		switch(face)
			{
				case 1:
					die1.setIcon(new ImageIcon("die1.gif"));
					break;
				case 2:
					die1.setIcon(new ImageIcon("die2.gif"));
					break;
				case 3:
					die1.setIcon(new ImageIcon("die3.gif"));
					break;
				case 4:
					die1.setIcon(new ImageIcon("die4.gif"));
					break;
				case 5:
					die1.setIcon(new ImageIcon("die5.gif"));
					break;
				case 6:
					die1.setIcon(new ImageIcon("die6.gif"));
					break;
				default:
					break;
			}
	}
	
	private static void runRoll()
	{
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
