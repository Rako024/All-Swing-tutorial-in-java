import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PaswordField {

	public static void main(String[] args) {
		JFrame f = new JFrame("Password");
		
		JPasswordField p = new JPasswordField();
		JLabel l1 = new JLabel("Password : ");
		JButton btn = new JButton("Send");
		JLabel l2 = new JLabel();
		l1.setBounds(50, 30, 100, 30);
		p.setBounds(50, 60, 150, 30);
		btn.setBounds(75, 110, 75, 25);
		l2.setBounds(220, 30, 150, 30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				l2.setText(new String(p.getPassword()));
				
			}
		});
		
		f.add(l1);
		f.add(p);
		f.add(btn);
		f.add(l2);
		
		
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
	}

}
