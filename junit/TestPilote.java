package jeuxDeVoitureAuto.junit;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;

import jeuxDeVoitureAuto.ihm.pan.PanTablePilote;

public class TestPilote extends JFrame{
	public TestPilote() throws FileNotFoundException, UnsupportedEncodingException{
		add(new PanTablePilote());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestPilote().setVisible(true);
	}

}
