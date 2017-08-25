package vue.ihm.pan.tree;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import model.ihm.tree.TreeModelVoiture;

public class PanTreeVoiture extends JPanel {
	TreeModelVoiture model=new TreeModelVoiture();
	JTree tree=new JTree(model);
	public PanTreeVoiture(){
		add(new JScrollPane(tree));
	}
}
