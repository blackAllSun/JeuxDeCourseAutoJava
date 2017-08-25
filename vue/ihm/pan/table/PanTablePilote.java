package vue.ihm.pan.table;

import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import vue.ihm.renderer.table.StatutRenderer;
import vue.ihm.renderer.table.TableLabelRendererVoiture;
import model.ihm.table.TableModelPilote;
import model.pojo.Statut;

public class PanTablePilote extends JPanel{
	TableModelPilote model=new TableModelPilote();
	JTable table=new JTable(model);
	public PanTablePilote(){
		add(new JScrollPane(table));
		table.setDefaultRenderer(Statut.class, new StatutRenderer());
	//	table.getColumnModel().getColumn(5).setCellRenderer(new TableLabelRendererVoiture());
	}
}
