import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class PopupMenu {

	public static void main(String[] args) {
		JFrame f = new JFrame("Popup Menu");
		JPopupMenu pm = new JPopupMenu("Menu");
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem paste = new JMenuItem("Paste");
		pm.add(cut);
		pm.add(copy);
		pm.add(paste);
		
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == e.BUTTON3) {	// only listened right click
				pm.show(f,e.getX(),e.getY());
				}
			}
		});
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
