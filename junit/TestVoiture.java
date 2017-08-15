package jeuxDeVoitureAuto.junit;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;

import jeuxDeVoitureAuto.ihm.pan.PanTableEcurie;
import jeuxDeVoitureAuto.ihm.pan.PanTableVoiture;

public class TestVoiture extends JFrame{
	public TestVoiture() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTableVoiture());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestVoiture().setVisible(true);
	}
}
