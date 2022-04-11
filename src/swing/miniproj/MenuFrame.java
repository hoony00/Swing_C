package swing.miniproj;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuFrame extends JFrame{

	public MenuFrame(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(2700, 200);
		setSize(100, 200);
		setLayout(new BorderLayout());
		
		setPanelCenter();
		
		setVisible(true);
	}
	
	private void setPanelCenter() {
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(2, 1, 10, 10));
		panelCenter.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));

		
		JButton btn1 = new JButton("버튼 1");
		btn1.setPreferredSize(new Dimension(80, 60));
		
		JButton btn2 = new JButton("버튼 2");
		btn2.setPreferredSize(new Dimension(80, 60));
		
		panelCenter.add(btn1);
		panelCenter.add(btn2);
		
		add(panelCenter);		
	}

	public static void main(String[] args) {
		new MenuFrame("메뉴");
	}
}
