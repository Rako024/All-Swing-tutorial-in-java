import javax.swing.*;

public class OptionPane {

	public static void main(String[] args) {
		JFrame f = new JFrame("Option Pane");
		//JOptionPane.showMessageDialog(f, "Helloo");
		//JOptionPane.showMessageDialog(f, "Error!","Warning",JOptionPane.WARNING_MESSAGE);
		String name = JOptionPane.showInputDialog(f,"Enter name :");
		System.out.println(name);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
