package vue.ihm.pan.tree;

import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import model.ihm.tree.TreeModelContrat;

public class PanTreeContrat extends JPanel {
	TreeModelContrat model=new TreeModelContrat();
	JTree tree=new JTree(model);
	public PanTreeContrat(){
		add(new JScrollPane(tree));
	}
}
