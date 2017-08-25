package vue.ihm.pan.list;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;

import model.ihm.list.ListModelEcurie;

public class PanListEcurie extends JPanel{
	ListModelEcurie model=new ListModelEcurie();
	JList list=new JList(model);
	public PanListEcurie(){
		
		add(list,BorderLayout.WEST);
	}
}
