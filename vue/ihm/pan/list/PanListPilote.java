package vue.ihm.pan.list;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;

import model.ihm.list.ListModelPilote;

public class PanListPilote extends JPanel{
	ListModelPilote model=new ListModelPilote();
	JList list=new JList(model);
	public PanListPilote(){
		
		add(list,BorderLayout.WEST);
	}
}