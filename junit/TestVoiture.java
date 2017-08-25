package junit;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

import vue.dialog.DialogAchatVoiture;
import vue.ihm.pan.list.PanListVoiture;

import vue.ihm.pan.table.PanTableVoiture;
import vue.ihm.pan.tree.PanTreeVoiture;

public class TestVoiture extends JFrame implements ActionListener{
	JButton buttonDialog=new JButton("Achat Voiture");
	JToolBar toolBar=new JToolBar();
	public TestVoiture() throws FileNotFoundException, UnsupportedEncodingException{
		add(getToolBar(),BorderLayout.NORTH);
		add(new PanTableVoiture(),BorderLayout.CENTER);
		add(new PanListVoiture(),BorderLayout.WEST);
		add(new PanTreeVoiture(),BorderLayout.EAST);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		buttonDialog.addActionListener(this);
		pack();
	}
	public JToolBar getToolBar(){
		JToolBar toolBar=new JToolBar();
		toolBar.add(buttonDialog);
		return toolBar;
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		new TestVoiture().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ev) {
		if(ev.getActionCommand()=="Achat Voiture"){
			DialogAchatVoiture dialog=new DialogAchatVoiture(this,"Achat Voiture",true);
			dialog.setVisible(true);}
			
	}
}
