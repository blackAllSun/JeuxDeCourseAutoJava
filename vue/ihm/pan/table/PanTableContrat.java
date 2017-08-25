package vue.ihm.pan.table;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.ihm.table.TableModelContrat;

public class PanTableContrat extends JPanel {
	TableModelContrat model=new TableModelContrat();
	JTable table=new JTable(model);
	public PanTableContrat() {
		add(new JScrollPane(table));
		//table.setDefaultRenderer(Statut.class, new StatutRenderer());
	//	table.getColumnModel().getColumn(5).setCellRenderer(new TableLabelRendererVoiture());
	}
}
