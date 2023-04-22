import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Label {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Yazi");
		JLabel l1 = new JLabel();
		l1.setText("Saaamm dostlarrr");
		l1.setBounds(150,150,300,40);
		JButton btn1 =new JButton("Klickle");
		btn1.setBounds(150, 200, 100, 40);
		btn1.addActionListener(new ActionListener() {
			int c=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText(c++ +" defe klick olundu");
				
			}
		});
		frame.add(btn1);
		frame.add(l1);
		frame.setSize(450,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
