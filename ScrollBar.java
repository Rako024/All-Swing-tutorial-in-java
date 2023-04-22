import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JScrollBar;

public class ScrollBar {

	public static void main(String[] args) {
		JFrame f = new JFrame("Scroll Bar");
		JLabel l = new JLabel();
		l.setBounds(150,105,200,20);
		JScrollBar s = new JScrollBar(JScrollBar.VERTICAL,0,0,0,100);
		s.setBounds(50, 50, 20, 200);
		s.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
					l.setText("Value : "+s.getValue());
			}
		});
		
		f.add(s);
		f.add(l);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
