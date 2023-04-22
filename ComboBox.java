import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComboBox {

	public static void main(String[] args) {
		JFrame f = new JFrame("Combo Box");
		String[] arr = {"C","C++","Java","C#","JavaScript","Python"};
		JComboBox cb = new JComboBox(arr);
		JButton btn = new JButton("Select");
		btn.setBounds(50, 80, 100, 50);
		cb.setBounds(50, 50, 100, 20);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text ="Selected programing language : "+cb.getSelectedItem();
				System.out.println(text);
			}
		});
		
		f.add(btn);
		f.add(cb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
