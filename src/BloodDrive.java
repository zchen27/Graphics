import java.awt.*;
import java.awt.event.*;
import java.math.*;
import javax.swing.*;

public class BloodDrive
{
	JFrame frame;
	JPanel panel;
	JLabel department0 = new JLabel("BALLISTICS AND ROCKETRY");
	JLabel department1 = new JLabel("MATERIAL SCIENCE");
	JLabel department2 = new JLabel("CIVIL ENGINEERING");
	JLabel department3 = new JLabel("LEGAL");
	JLabel department4 = new JLabel("EXOTIC MECHANICS");
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
	
	public BloodDrive()
	{
		frame = new JFrame();
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		
	}
}
