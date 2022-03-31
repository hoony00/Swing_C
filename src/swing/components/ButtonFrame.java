package swing.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonFrame extends JFrame implements ActionListener{

	private JButton btn1;
	private JButton btn2;
	
	private JLabel lbl1;
	private JLabel lbl2;	
	
	public ButtonFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(2600, 200);
		setSize(200, 300);
		setLayout(new FlowLayout());
		
		btn1 = new JButton("버튼1");
		btn1.setForeground(Color.RED);
		btn1.addActionListener(this);
		
		btn2 = new JButton("버튼2");
		btn2.setEnabled(false);
		btn2.setVisible(true);
		btn2.addActionListener(this);
		
		add(btn1);
		add(btn2);
		
		lbl1 = new JLabel("자바 스윙 공부중...");
		add(lbl1);
		
		ImageIcon image = new ImageIcon("images/apple.jpg");
		lbl2 = new JLabel(image);
		add(lbl2);
				
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn1) {
			btn2.setVisible(true);
			btn2.setEnabled(true);
		} else if(obj == btn2) {
			btn2.setVisible(false);
		}
		
	}
}
