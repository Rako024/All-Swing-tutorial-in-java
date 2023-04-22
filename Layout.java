import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Layout {

	public static void main(String[] args) {
		JFrame f = new JFrame("Layout");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		
		JPanel p = new JPanel();
		/*p.setLayout(new BorderLayout());
		p.add(b1,BorderLayout.NORTH);
		p.add(b2,BorderLayout.SOUTH);
		p.add(b3,BorderLayout.EAST);
		p.add(b4,BorderLayout.WEST);
		p.add(b5,BorderLayout.CENTER);*/
		
		p.setLayout(new GridLayout(3,2));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		f.add(p);
		f.setSize(500,500);
		f.setVisible(true);
	}

}
