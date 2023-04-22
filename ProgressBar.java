import javax.swing.*;

public class ProgressBar {

	public static void main(String[] args) {
		JFrame f = new JFrame("Progress Bar");
		JProgressBar pb = new JProgressBar(0,2000);
		pb.setBounds(50, 50, 150, 20);
		pb.setStringPainted(true);
		
		f.add(pb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		for(int i = 0 ; i<=2000;i+=20) {
			pb.setValue(i);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
