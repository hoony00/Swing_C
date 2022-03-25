package swing.event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionTemp extends JFrame{

	private JButton btn;
	
	public ActionTemp(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		btn = new JButton("Action");
				
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("AAA");
			}
		});
		add(btn);
		
		setVisible(true);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Object obj = e.getSource();
//		if(obj == btn) {
//			if(btn.getText().equals("Action")) {
//				btn.setText("액션");
//			}else {
//				btn.setText("Action");
//			}
//		}		
//	}	
}
