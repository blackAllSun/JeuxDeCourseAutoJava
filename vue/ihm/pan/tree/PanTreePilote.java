package vue.ihm.pan.tree;

import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import model.ihm.tree.TreeModelPilote;

public class PanTreePilote  extends JPanel {
	TreeModelPilote model=new TreeModelPilote();
	JTree tree=new JTree(model);
	public PanTreePilote(){
		add(new JScrollPane(tree));
	}
}
