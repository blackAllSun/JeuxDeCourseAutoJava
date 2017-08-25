package vue.ihm.pan.tree;

import java.awt.*;

import javax.swing.*;

import model.ihm.tree.TreeModelSponsor;

public class PanTreeSponsor extends JPanel {
	TreeModelSponsor model=new TreeModelSponsor();
	JTree tree=new JTree(model);
	public PanTreeSponsor(){
		add(new JScrollPane(tree));
	}
}
