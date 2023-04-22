import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu {

	public static void main(String[] args) {
		JFrame f = new JFrame("Menu");
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("Menu 1");
		JMenu subMenu = new JMenu("Javascript");
		JMenuItem i1 = new JMenuItem("C++");
		JMenuItem i2 = new JMenuItem("Java");
		JMenuItem i3 = new JMenuItem("Python");
		i1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "C++ selected");
			}
		} );
		JMenuItem s1 = new JMenuItem("React");
		JMenuItem s2 = new JMenuItem("Node.js");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		subMenu.add(s1);
		subMenu.add(s2);
		menu.add(subMenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
