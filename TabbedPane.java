import javax.swing.*;

public class TabbedPane {

	public static void main(String[] args) {
		JFrame f = new JFrame("Tabbed Pane");
		
		JLabel l1 = new JLabel("1nd Area");
		JPanel p1 = new JPanel();
		p1.add(l1);
		
		JLabel l2 = new JLabel("2nd Area");
		JPanel p2 = new JPanel();
		p2.add(l2);
		
		JLabel l3 = new JLabel("3nd Area");
		JPanel p3 = new JPanel();
		p3.add(l3);
		
		JTabbedPane tp = new JTabbedPane();
		tp.setBounds(5, 10, 620, 570);
		
		tp.add("1nd",p1);
		tp.add("2nd",p2);
		tp.add("3nd",p3);
		
		f.add(tp);
		f.setSize(650,500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
