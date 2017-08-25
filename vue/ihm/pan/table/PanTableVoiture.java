package vue.ihm.pan.table;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.ihm.table.TableModelVoiture;
import vue.ihm.renderer.table.ColorRenderer;

public class PanTableVoiture extends JPanel {
	TableModelVoiture model=new TableModelVoiture();
	JTable table=new JTable(model);
	public PanTableVoiture() {
		add(new JScrollPane(table));
		//table.setDefaultRenderer(Statut.class, new StatutRenderer());
		table.setDefaultRenderer(Color.class, new ColorRenderer());
	//	table.getColumnModel().getColumn(5).setCellRenderer(new TableLabelRendererVoiture());
	}
}
