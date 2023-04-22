import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,400);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton btn = new JButton("button");
		panel.add(btn);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		frame.setVisible(true);

	}

}
