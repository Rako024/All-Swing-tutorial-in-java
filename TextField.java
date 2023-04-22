import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class TextField {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Text Field");
		
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		JButton btn = new JButton("Sum");
		l1 = new JLabel("First Number");
		l1.setBounds(50,20,100,30);
		t1 = new JTextField();
		t1.setBounds(50, 50, 100, 30);
		l2 = new JLabel("Last Number");
		l2.setBounds(170,20,100,30);
		t2 = new JTextField();
		t2.setBounds(170, 50, 100, 30);
		l3 = new JLabel("Response");
		l3.setBounds(110, 85, 100, 20);
		t3 = new JTextField();
		t3.setBounds(110, 105, 100, 30);
		t3.setEditable(false);
		
		btn = new JButton("Add");
		btn.setBounds(110, 150, 100, 30);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(t1.getText());
				int b= Integer.parseInt(t2.getText());
				t3.setText(String.valueOf(a+b));
				
			}
		});
		
		frame.add(btn);
		frame.add(l3);
		frame.add(t3);
		frame.add(l2);
		frame.add(t2);
		frame.add(t1);
		frame.add(l1);
		frame.setLayout(null);
		frame.setSize(360,400);
		frame.setVisible(true);
	}

}
