package vue.dialog;

import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableCellEditor;

import controleur.ihm.ControleurAchatVoiture;
import model.ihm.table.TableModelVoiture;

public class DialogAchatVoiture extends JDialog{
	TableModelVoiture model=new TableModelVoiture();
	JTable table=new JTable(model);
	int selectedRow;
	public DialogAchatVoiture(JFrame owner, String titre , boolean modal){
		super(owner,titre,modal);
		add(new JScrollPane(table));
		ListSelectionModel listSelectionModel = table.getSelectionModel();        
		listSelectionModel.addListSelectionListener(new ControleurAchatVoiture());
		pack();
	}
}
