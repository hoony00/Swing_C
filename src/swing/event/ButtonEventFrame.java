package swing.event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEventFrame extends JFrame implements ActionListener{

	private JButton btn1;		// 인스턴스 변수
	private JButton btn2;
	
	public ButtonEventFrame(String title) {		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		btn1 = new JButton("버튼1");
		btn1.addActionListener(this);
		add(btn1);
		
		btn2 = new JButton("버튼2");
		btn2.addActionListener(this);
		add(btn2);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btn1) {
			System.out.println("AAA");
			btn1.setBackground(Color.GREEN);
		} else if(obj == btn2) {
			System.out.println("BBB");
		}
		
	}
	
}
