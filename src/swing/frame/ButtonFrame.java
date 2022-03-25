package swing.frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonFrame extends JFrame{

	public ButtonFrame(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(300, 300);
				
		JButton btn = new JButton("버튼");
		add(btn);
		
		setVisible(true);
	}
	
}
