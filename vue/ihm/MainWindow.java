package vue.ihm;

import java.awt.*;

import javax.swing.*;

import vue.ihm.pan.*;
import vue.ihm.pan.table.PanTableAdresse;
import vue.ihm.pan.table.PanTableContrat;
import vue.ihm.pan.table.PanTableEcurie;
import vue.ihm.pan.table.PanTablePilote;
import vue.ihm.pan.table.PanTableSponsor;
import vue.ihm.pan.table.PanTableVoiture;

public class MainWindow extends JFrame{
	JMenuBar menuBar=new JMenuBar();
	JToolBar toolBar=new JToolBar();
	PanTableAdresse panTabAdress=new PanTableAdresse();
	PanTableContrat panTabContrat=new PanTableContrat();
	PanTableEcurie panTabEcurie=new PanTableEcurie();
	PanTableVoiture panTabVoiture=new PanTableVoiture();
	PanTablePilote panTabPilote=new PanTablePilote();
	PanTableSponsor panTabSponsor=new PanTableSponsor();
	public MainWindow(String title){
		super(title);
		setJMenuBar(menuBar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(new Dimension(1024,840));
		add(toolBar,BorderLayout.NORTH);
		add(new JPanel(),BorderLayout.CENTER);
		add(getPanWest(),BorderLayout.WEST);
		add(getPanEst(),BorderLayout.EAST);
		add(new JLabel("Status"),BorderLayout.SOUTH);
	}
	public void initMenuBar(JMenuBar menuBar){
		//TODO CHERCHER NOMS EVENT DU JMENU + PACKAGES
		//TODO IDEM POUR GAME2D ET GAME3D
		JMenu menuFile=new JMenu("Fichier");
		JMenuItem menuNewGame=new JMenuItem("New Game");
		JMenuItem menuOpen=new JMenuItem("Open");
		JMenuItem menuSave=new JMenuItem("Save");
		JMenuItem menuSaveAt=new JMenuItem("Save At");
		JMenuItem menuQuit=new JMenuItem("Quit");
		JMenu menuEdition=new JMenu("Edition");
		JMenu menuAffichage=new JMenu("Affichage");
		JMenu menuPreferences=new JMenu("Preferences");
		JMenu menuAides=new JMenu("Aides");
	}
	public JPanel getPanWest(){
		JPanel pan=new JPanel();
		pan.setLayout(new BoxLayout(pan,  BoxLayout.Y_AXIS));
        GridBagConstraints gbc = new GridBagConstraints();
		pan.add(panTabAdress, gbc);
		pan.add(panTabEcurie, gbc);
		pan.add(panTabSponsor, gbc);
		return pan;}
	public JPanel getPanEst(){
		JPanel pan=new JPanel();
		pan.setLayout(new BoxLayout(pan,  BoxLayout.Y_AXIS));
        GridBagConstraints gbc = new GridBagConstraints();
		pan.add(panTabContrat, gbc);
		pan.add(panTabPilote, gbc);
		pan.add(panTabVoiture, gbc);
		return pan;}
	public static void main(String[] args) {
		new MainWindow("Jeux de voiture rapide").setVisible(true);}

}
