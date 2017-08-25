package vue.ihm.pan.list;

import java.awt.BorderLayout;

import javax.swing.JList;
import javax.swing.JPanel;

import model.ihm.list.ListModelAdresse;
import vue.ihm.renderer.list.ListRendererAdresse;

public class PanListAdresse extends JPanel{
	ListRendererAdresse renderer=new ListRendererAdresse();
	ListModelAdresse model=new ListModelAdresse();
	JList list=new JList(model);
	public PanListAdresse(){
		
		add(list,BorderLayout.WEST);
		list.setCellRenderer(renderer);
	}
}
 