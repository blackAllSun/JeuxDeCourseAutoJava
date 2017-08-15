package jeuxDeVoitureAuto.junit;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;

import jeuxDeVoitureAuto.ihm.pan.PanTableEcurie;
import jeuxDeVoitureAuto.ihm.pan.PanTableSponsor;

public class TestEcurie extends JFrame{
	public TestEcurie() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTableEcurie());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestEcurie().setVisible(true);
	}
}
