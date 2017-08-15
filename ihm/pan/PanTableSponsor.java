package jeuxDeVoitureAuto.ihm.pan;

import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import jeuxDeVoitureAuto.ihm.table.TableModelSponsor;


public class PanTableSponsor extends JPanel {
	TableModelSponsor model=new TableModelSponsor();
	JTable table=new JTable(model);
	public PanTableSponsor() throws FileNotFoundException, UnsupportedEncodingException{
		add(new JScrollPane(table));
		//table.setDefaultRenderer(Statut.class, new StatutRenderer());
	//	table.getColumnModel().getColumn(5).setCellRenderer(new TableLabelRendererVoiture());
	}
}
