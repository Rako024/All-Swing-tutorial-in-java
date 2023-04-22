import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class List {

	public static void main(String[] args) {
		JFrame f = new JFrame("Radio Button");
		DefaultListModel<String> l = new DefaultListModel<>();
		l.addElement("C");
		l.addElement("C++");
		l.addElement("C#");
		l.addElement("Java");
		l.addElement("Python");
		l.addElement("JavaScript");
		JList<String> lsit = new JList<>(l);
		lsit.setBounds(10, 10, 150, 120);
		lsit.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION); // single selection

		DefaultListModel<String> l2 = new DefaultListModel<>();
		l2.addElement("Swing");
		l2.addElement("Django");
		l2.addElement("React");
		l2.addElement("Node.js");
		l2.addElement("BootStrap");
		l2.addElement("Laravel");
		JList<String> lsit2 = new JList<>(l2);
		lsit2.setBounds(220, 10, 150, 120);

		JButton btn = new JButton("Send");
		btn.setBounds(100, 130, 100, 50);

		btn.addActionListener(new ActionListener() {
			String text = "";

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (lsit.getSelectedIndex() != -1) {
					text = "Seleted programing language : " + lsit.getSelectedValue();
				}
				if (lsit2.getSelectedIndex() != -1) {
					text += " , Selected frameworks : ";
					for (Object item : lsit2.getSelectedValuesList()) {
						text += item + " ";
					}
				}
				System.out.println(text);
			}
		});

		f.add(lsit);
		f.add(lsit2);
		f.add(btn);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
