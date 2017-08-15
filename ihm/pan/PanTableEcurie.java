package jeuxDeVoitureAuto.ihm.pan;

import java.awt.Component;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import jeuxDeVoitureAuto.ihm.renderer.TableLabelRendererAdresse;
import jeuxDeVoitureAuto.ihm.table.TableModelEcurie;


public class PanTableEcurie extends JPanel {
	TableModelEcurie model=new TableModelEcurie();
	JTable table=new JTable(model);
	JScrollPane scroll=new JScrollPane(table);
	public PanTableEcurie() throws FileNotFoundException, UnsupportedEncodingException{
		add(scroll);
		scroll.setPreferredSize(new Dimension(1024,840));
		table.setAutoCreateRowSorter(true);
		//table.setDefaultRenderer(Statut.class, new StatutRenderer());
		table.getColumnModel().getColumn(2).setCellRenderer(new TableLabelRendererAdresse());
	}
}
