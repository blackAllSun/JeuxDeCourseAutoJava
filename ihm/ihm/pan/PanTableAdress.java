package jeuxDeVoitureAuto.ihm.pan;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import jeuxDeVoitureAuto.ihm.table.TableModelAdress;

public class PanTableAdress extends JPanel{
	TableModelAdress model=new TableModelAdress();
	JTable table=new JTable(model);
	public PanTableAdress() throws FileNotFoundException, UnsupportedEncodingException{
		add(new JScrollPane(table));
	}
}
