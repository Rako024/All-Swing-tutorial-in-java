import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButton {

	public static void main(String[] args) {
		JFrame f = new JFrame("Radio Button");
		JRadioButton r1 = new JRadioButton("Male");
		r1.setActionCommand("m");
		JRadioButton r2 = new JRadioButton("Female");
		r2.setActionCommand("f");
		JRadioButton r3 = new JRadioButton("Null",true);
		r3.setActionCommand("n");
		JLabel lb= new JLabel("Please Select :");
		JButton btn = new JButton("Send");
		lb.setBounds(50, 20, 100, 20);
		r1.setBounds(50, 50, 100, 20);
		r2.setBounds(50, 80, 100, 20);
		r3.setBounds(50, 110, 100, 20);
		btn.setBounds(50, 140, 100, 35);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r3);
		bg.add(r2);
		bg.add(r1);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(bg.getSelection().getActionCommand());
			}
		});
		
		
		f.add(lb);
		f.add(r3);
		f.add(r2);
		f.add(r1);
		f.add(btn);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
