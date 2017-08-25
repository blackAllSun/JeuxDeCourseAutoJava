package junit;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;
import javax.swing.JList;

import model.ihm.list.ListModelContrat;
import vue.ihm.pan.list.PanListContrat;
import vue.ihm.pan.table.PanTableContrat;
import vue.ihm.pan.tree.PanTreeContrat;

public class TestContrat extends JFrame{
	public TestContrat() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTableContrat(),BorderLayout.CENTER);
		add(new PanListContrat(),BorderLayout.WEST);
		add(new PanTreeContrat(),BorderLayout.EAST);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestContrat().setVisible(true);
	}
}
