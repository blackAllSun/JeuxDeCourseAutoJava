package vue.ihm.pan.table;

import java.awt.Component;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.ihm.table.TableModelEcurie;
import vue.ihm.renderer.table.TableLabelRendererAdresse;


public class PanTableEcurie extends JPanel {
	TableModelEcurie model=new TableModelEcurie();
	JTable table=new JTable(model);
	JScrollPane scroll=new JScrollPane(table);
	public PanTableEcurie() {
		add(scroll);
		//scroll.setPreferredSize(new Dimension(1024,840));
		table.setAutoCreateRowSorter(true);
		//table.setDefaultRenderer(Statut.class, new StatutRenderer());
		try {
			table.getColumnModel().getColumn(2).setCellRenderer(new TableLabelRendererAdresse());
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			//FIXME Handle this exception
			e.printStackTrace();
		}
	}
}
