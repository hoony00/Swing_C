package swing.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class CheckBoxFrame extends JFrame implements ItemListener{

	private JCheckBox[] ch;
	private int sum = 0;
	private JLabel result;
	
	private JRadioButton[] radios;
	
	public CheckBoxFrame(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(2700, 200);
		setSize(220, 300);
		setLayout(new FlowLayout());
		
		JLabel lbl = new JLabel("사과 100원, 배 500원, 체리 2000원");
		add(lbl);
		
		String[] names = {"사과", "배", "체리"};
		
		ch = new JCheckBox[3];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = new JCheckBox(names[i]);
			ch[i].addItemListener(this);
			add(ch[i]);
		}
		
		result = new JLabel("합계 : 0 원");
		add(result);
		
		ButtonGroup g = new ButtonGroup();
		
		radios = new JRadioButton[3];
		for (int i = 0; i < radios.length; i++) {
			radios[i] = new JRadioButton(names[i]);
			g.add(radios[i]);
			add(radios[i]);
		}
		
		
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		int val = e.getStateChange();
		int sign = 0;
		if(val == ItemEvent.SELECTED) {
			sign = 1;
		} else {
			sign = -1;
		}
		
		Object obj = e.getItem();
		if(obj == ch[0]) {
			sum += (100 * sign);
		} else if(obj == ch[1]) {
			sum += (500 * sign);
		} else if(obj == ch[2]) {
			sum += (2000 * sign);
		}
		
		result.setText("합계 : " + sum + " 원");
	}
	
}
