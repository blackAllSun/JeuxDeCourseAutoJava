package jeuxDeVoitureAuto.ihm.pan;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import jeuxDeVoitureAuto.ihm.table.TableModelVoiture;

public class PanTableVoiture extends JPanel {
	TableModelVoiture model=new TableModelVoiture();
	JTable table=new JTable(model);
	public PanTableVoiture() throws FileNotFoundException, UnsupportedEncodingException{
		add(new JScrollPane(table));
		//table.setDefaultRenderer(Statut.class, new StatutRenderer());
	//	table.getColumnModel().getColumn(5).setCellRenderer(new TableLabelRendererVoiture());
	}
}
