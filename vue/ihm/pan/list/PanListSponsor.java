package vue.ihm.pan.list;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;

import model.ihm.list.ListModelSponsor;

public class PanListSponsor extends JPanel{
	ListModelSponsor model=new ListModelSponsor();
	JList list=new JList(model);
	public PanListSponsor(){
		
		add(list,BorderLayout.WEST);
	}
}