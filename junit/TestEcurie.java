package junit;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;
import javax.swing.JList;

import model.ihm.list.ListModelEcurie;
import vue.ihm.pan.list.PanListEcurie;
import vue.ihm.pan.table.PanTableEcurie;
import vue.ihm.pan.table.PanTableSponsor;
import vue.ihm.pan.tree.PanTreeEcurie;

public class TestEcurie extends JFrame{
	public TestEcurie() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTableEcurie(),BorderLayout.CENTER);
		add(new PanListEcurie(),BorderLayout.WEST);
		add(new PanTreeEcurie(),BorderLayout.EAST);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestEcurie().setVisible(true);
	}
}
