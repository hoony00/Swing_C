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
	private JLabel lbl;
	private JLabel imglbl;
	
	public ButtonFrame(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(200, 300);
		setLayout(new FlowLayout());
		
		btn1 = new JButton("버튼 1");
		btn1.addActionListener(this);
		btn1.setForeground(Color.RED);
		
		btn2 = new JButton("버튼 2");
		btn2.setEnabled(false);
		btn2.setVisible(true);
		
		add(btn1);
		add(btn2);
		
		lbl = new JLabel("자바 Swing 공부중");
		add(lbl);
		
		ImageIcon image = new ImageIcon("images/apple.jpg");
		imglbl = new JLabel(image);
		add(imglbl);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btn1) {
			btn2.setEnabled(true);
			btn2.setVisible(true);
		}
		
	}
	
}
