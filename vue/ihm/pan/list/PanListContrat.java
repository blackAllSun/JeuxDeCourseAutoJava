package vue.ihm.pan.list;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;

import model.ihm.list.ListModelContrat;
public class PanListContrat extends JPanel{
	ListModelContrat model=new ListModelContrat();
	JList list=new JList(model);
	public PanListContrat(){
		
		add(list,BorderLayout.WEST);
	}
}
 