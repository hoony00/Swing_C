package swing.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseClick extends JFrame implements MouseListener{

	private JLabel lbl;
	
	public MouseClick(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1300, 300);
		setSize(300, 300);
		
		Container c = getContentPane();
		c.setLayout(null);
		lbl = new JLabel("ȫ�浿");
		lbl.addMouseListener(this);
		lbl.setSize(50, 25);
		lbl.setLocation(100, 100);
		c.add(lbl);
		
		c.addMouseListener(this);
		
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();		
		System.out.println(x + ", " + y);
		lbl.setLocation(x, y);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		
		if(obj == lbl) {
			System.out.println("AAA");
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
