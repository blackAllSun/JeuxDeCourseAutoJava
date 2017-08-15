package jeuxDeVoitureAuto.ihm.pan;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import jeuxDeVoitureAuto.ihm.table.TableModelContrat;

public class PanTableContrat extends JPanel {
	TableModelContrat model=new TableModelContrat();
	JTable table=new JTable(model);
	public PanTableContrat() throws FileNotFoundException, UnsupportedEncodingException{
		add(new JScrollPane(table));
		//table.setDefaultRenderer(Statut.class, new StatutRenderer());
	//	table.getColumnModel().getColumn(5).setCellRenderer(new TableLabelRendererVoiture());
	}
}
