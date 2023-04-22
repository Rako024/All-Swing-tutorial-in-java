import javax.swing.*;

public class Table {

	public static void main(String[] args) {
		JFrame f = new JFrame("Table");
		String [][] info = {{"1","Math","85"},{"2","Eng","97"},{"3","Geo","75"}};
		String [] header = {"№","Subject","Point"};
		JTable tbl = new JTable(info,header);
		tbl.setBounds(50, 50, 200, 100);
		JScrollPane sp = new JScrollPane(tbl);
		f.add(sp);
		f.setSize(400,400);

		f.setVisible(true);
	}

}
