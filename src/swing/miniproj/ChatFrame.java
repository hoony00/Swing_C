package swing.miniproj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatFrame extends JFrame implements ActionListener{

	private JPanel panelCenter;
	private JPanel panelSouth;
	
	private JTextField tf;
	
	private JButton btn;
	private JButton btn2;
	
	private JTextArea ta;
	
	private MainFrame mainFrame;
	
	public ChatFrame(String title, int width, int height, MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;				
		
		mainFrame.setTitle("CCC");
		
		setTitle(title);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(2800, 200);
		setSize(width, height);
		setLayout(new BorderLayout());
		
		setCenter();
		
		setSouth();
		
		setVisible(true);
		
		tf.requestFocus();
	}

	private void setCenter() {
		panelCenter = new JPanel();
		panelCenter.setBackground(Color.BLUE);
		panelCenter.setLayout(new BorderLayout());
		
		ta = new JTextArea(7,18);
		ta.setLineWrap(true);
		ta.setEditable(false);
		JScrollPane sp = new JScrollPane(ta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		panelCenter.add(sp);
		
		add(panelCenter, BorderLayout.CENTER);
	}

	private void setSouth() {
		panelSouth = new JPanel();
		//panelSouth.setBackground(Color.RED);
		
		tf = new JTextField(18);
		tf.addActionListener(this);
		panelSouth.add(tf);
		
		btn = new JButton("전송");
		btn.addActionListener(this);
		
		btn2 = new JButton("전송2");
		btn2.addActionListener(this);
		
		panelSouth.add(btn);
//		panelSouth.add(btn2);
		
		add(panelSouth, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btn || obj == tf) {			
			
			JTextArea ta2 = mainFrame.getTa();
			ta2.append("[클라이언트] : " + tf.getText() + "\n");
			
			localType();
		} else if(obj == btn2) {
			mainFrame.setTitle("홍길동");
		}
		
	}

	private void localType() {
		ta.append("[클라이언트] : " + tf.getText() + "\n");
		tf.setText("");
		tf.requestFocus();
	}

	public JButton getBtn() {
		return btn;
	}

	public JTextArea getTa() {
		return ta;
	}
	
	
	
}
