package swing.frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button3Frame extends JFrame{

	public Button3Frame(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		Container c = this.getContentPane();
		
		JButton btn1 = new JButton("OK");
		btn1.setBackground(Color.GREEN);
		add(btn1);
		JButton btn2 = new JButton("Cancel");
		add(btn2);
		JButton btn3 = new JButton("Ignore");
		add(btn3);
		
		c.setBackground(Color.YELLOW);
		
		setVisible(true);
	}
	
}
