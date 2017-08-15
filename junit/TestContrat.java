package jeuxDeVoitureAuto.junit;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;

import jeuxDeVoitureAuto.ihm.pan.PanTableContrat;

public class TestContrat extends JFrame{
	public TestContrat() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTableContrat());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestContrat().setVisible(true);
	}
}
