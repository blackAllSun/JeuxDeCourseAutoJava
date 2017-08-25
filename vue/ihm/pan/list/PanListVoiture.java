package vue.ihm.pan.list;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;

import model.ihm.list.ListModelVoiture;

public class PanListVoiture extends JPanel{
	ListModelVoiture model=new ListModelVoiture();
	JList list=new JList(model);
	public PanListVoiture(){
		
		add(list,BorderLayout.WEST);
	}
}
