import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextArea {

	public static void main(String[] args) {
		JFrame f = new JFrame("TextArea tutorial");
		JLabel l1, l2;
		JTextArea t;
		JButton btn;
		l1 = new JLabel();
		l1.setBounds(50, 20, 100, 30);
		l2 = new JLabel();
		l2.setBounds(250, 20, 100, 30);

		t = new JTextArea();
		t.setBounds(20, 65, 400, 200);
		btn= new JButton("calculate");
		btn.setBounds(100, 280, 200, 70);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = t.getText();
				String [] arr = text.split(" ");
				l1.setText("characters : "+text.length());
				l2.setText("words : "+ arr.length);
				
			}
		});
		
		f.add(btn);
		f.add(t);
		f.add(l2);
		f.add(l1);
		f.setLayout(null);
		f.setSize(600, 450);
		f.setVisible(true);
	}

}
