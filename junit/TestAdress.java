package junit;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;
import javax.swing.JList;

import model.ihm.list.ListModelAdresse;
import vue.ihm.pan.list.PanListAdresse;
import vue.ihm.pan.table.PanTableAdresse;
import vue.ihm.pan.tree.PanTreeAdresse;

public class TestAdress extends JFrame{
	public TestAdress() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTableAdresse(),BorderLayout.CENTER);
		add(new PanListAdresse(),BorderLayout.WEST);
		add(new PanTreeAdresse(),BorderLayout.EAST);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestAdress().setVisible(true);
	}

}
