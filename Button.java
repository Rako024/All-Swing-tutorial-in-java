import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Button learning");
		
		JButton btn = new JButton("Send");
		btn.setBounds(225, 250, 100, 50);
		frame.add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setText("saaaam");
			}
		});
	
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}

}
