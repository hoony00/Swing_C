package swing.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AniButtonFrame extends JFrame{
	
	private JButton btn;
	
	public AniButtonFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(2600, 200);
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		ImageIcon icon = new ImageIcon("images/normalIcon.gif");
		ImageIcon icon2 = new ImageIcon("images/pressedIcon.gif");
		ImageIcon icon3 = new ImageIcon("images/rolloverIcon.gif");
		btn = new JButton("Call", icon);
		btn.setPressedIcon(icon2);
		btn.setRolloverIcon(icon3);
		add(btn);
		
		setVisible(true);
	}
}
