package junit;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;

import vue.ihm.pan.list.PanListSponsor;

import vue.ihm.pan.table.PanTableSponsor;
import vue.ihm.pan.tree.PanTreeSponsor;

public class TestSponsor extends JFrame{
	public TestSponsor() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTableSponsor(),BorderLayout.CENTER);
		add(new PanListSponsor(),BorderLayout.WEST);
		add(new PanTreeSponsor(),BorderLayout.EAST);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestSponsor().setVisible(true);
	}
}
