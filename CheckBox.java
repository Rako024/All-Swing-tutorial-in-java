import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class CheckBox {
	public static String text="";
	public static void main(String[] args) {
		JFrame f = new JFrame("CheckBox");
		JCheckBox c1 = new JCheckBox("Im cucumber");
		JCheckBox c2 = new JCheckBox("Im stupid");
		JLabel l = new JLabel("Pls Select");
		l.setBounds(50, 10, 250, 20);
		c1.setBounds(50, 30, 250, 20);
		c2.setBounds(50, 55, 250, 20);
		
		c1.addItemListener(new ItemListener() {
			
		
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(c1.isSelected()) {
				CheckBox.text+="Cucumber ";
				l.setText("Selected : "+CheckBox.text);
				} else {
					CheckBox.text = "Stupid ";
					l.setText("");
					l.setText("Selected : "+CheckBox.text);
					
				}
				if(c1.isSelected()==false && c2.isSelected()==false) {
					l.setText("Pls Select :");
					CheckBox.text ="";
				}
				
			}
		});
		c2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(c2.isSelected()) {
				CheckBox.text+="Stupid ";
				l.setText("Selected : "+CheckBox.text);
				}else {
					CheckBox.text = "Cucumber ";
					l.setText("");
					l.setText("Selected : "+CheckBox.text);
				}
				if(c1.isSelected()==false && c2.isSelected()==false) {
					l.setText("Pls Select :");
					CheckBox.text ="";
				}
			}
		});
		
		f.add(l);
		f.add(c1);
		f.add(c2);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
	}

}
