package vue.ihm.pan.tree;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import model.ihm.tree.TreeModelEcurie;

public class PanTreeEcurie extends JPanel {
	TreeModelEcurie model=new TreeModelEcurie();
	JTree tree=new JTree(model);
	public PanTreeEcurie(){
		add(new JScrollPane(tree));
	}
}
