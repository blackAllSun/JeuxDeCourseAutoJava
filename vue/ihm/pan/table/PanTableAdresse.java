package vue.ihm.pan.table;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.ihm.table.TableModelAdress;

public class PanTableAdresse extends JPanel{
	TableModelAdress model=new TableModelAdress();
	JTable table=new JTable(model);
	public PanTableAdresse() {
		add(new JScrollPane(table));
	}
}
