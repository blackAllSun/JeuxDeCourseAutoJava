package jeuxDeVoitureAuto.junit;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;


import jeuxDeVoitureAuto.ihm.pan.PanTableSponsor;

public class TestSponsor extends JFrame{
	public TestSponsor() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTableSponsor());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestSponsor().setVisible(true);
	}
}
