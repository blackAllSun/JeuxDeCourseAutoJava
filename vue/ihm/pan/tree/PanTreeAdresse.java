package vue.ihm.pan.tree;

import java.awt.*;

import javax.swing.*;

import model.ihm.tree.TreeModelAdresse;

public class PanTreeAdresse extends JPanel {
	TreeModelAdresse model=new TreeModelAdresse();
	JTree tree=new JTree(model);
	public PanTreeAdresse(){
		add(new JScrollPane(tree));
	}
}
