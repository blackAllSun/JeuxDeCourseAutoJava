package junit;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;
import javax.swing.JList;

import model.ihm.list.ListModelPilote;
import vue.ihm.pan.list.PanListPilote;
import vue.ihm.pan.table.PanTablePilote;
import vue.ihm.pan.tree.PanTreePilote;

public class TestPilote extends JFrame{
	public TestPilote() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTablePilote(),BorderLayout.CENTER);
		add(new PanListPilote(),BorderLayout.WEST);
		add(new PanTreePilote(),BorderLayout.EAST);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestPilote().setVisible(true);
	}

}
