package jeuxDeVoitureAuto.pojo;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;

import jeuxDeVoitureAuto.ihm.pan.PanTableAdress;

public class TestAdress extends JFrame{
	public TestAdress() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTableAdress());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestAdress().setVisible(true);
	}

}
