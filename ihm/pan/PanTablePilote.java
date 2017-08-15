package jeuxDeVoitureAuto.ihm.pan;

import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import jeuxDeVoitureAuto.ihm.renderer.StatutRenderer;
import jeuxDeVoitureAuto.ihm.renderer.TableLabelRendererVoiture;
import jeuxDeVoitureAuto.ihm.table.TableModelPilote;
import jeuxDeVoitureAuto.pojo.Statut;

public class PanTablePilote extends JPanel{
	TableModelPilote model=new TableModelPilote();
	JTable table=new JTable(model);
	public PanTablePilote() throws FileNotFoundException, UnsupportedEncodingException{
		add(new JScrollPane(table));
		//table.setDefaultRenderer(Statut.class, new StatutRenderer());
	//	table.getColumnModel().getColumn(5).setCellRenderer(new TableLabelRendererVoiture());
	}
}
