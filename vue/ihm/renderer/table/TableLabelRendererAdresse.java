package vue.ihm.renderer.table;

import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.RootGson;
import model.pojo.Adresse;
import model.pojo.Contrat;
import model.pojo.Sponsor;

public class TableLabelRendererAdresse extends DefaultTableCellRenderer {
	String jsonString="/home/blackallsun/workspace/JeuxVoitureAuto/src/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
	RootGson root = gson.fromJson(reader, RootGson.class); 
	List<Sponsor> listSponsor=root.getSponsor();
	List<Adresse> listAdresse=root.getAdresse();
	
	String ville;
	String pays;
	String strText;
	public TableLabelRendererAdresse() throws FileNotFoundException, UnsupportedEncodingException{}
	public Component getTableCellRendererComponent(JTable table, Object value,
		                                                 boolean isSelected, boolean hasFocus, 
		                                                 int row, int column) {
		super.getTableCellRendererComponent(table, value, isSelected, hasFocus,	row, column);
		
			strText="<html><head></head><body>";
			strText+= "<label>Id : "+((Adresse) value).getIdAdresse()+"</label><br>";
			strText+="<label>Ville : "+((Adresse) value).getVille()+"</label><br>";
			strText+="<label>France : "+((Adresse) value).getPays()+"</label><br>";
			strText+="</body><html>";
			this.setPreferredSize(new Dimension(150,40));
			setText(strText);
		    return this;}
	public void searchAdresse(int indexAdresse){
		System.out.println("**** Adresse :      ****");
		 Collections.sort(listAdresse);

			 System.out.println("id : "+listAdresse.get(indexAdresse).getIdAdresse());
			 System.out.println("Ville : "+listAdresse.get(indexAdresse).getVille());
			 System.out.println("Pays : "+listAdresse.get(indexAdresse).getPays());
		 
	}	

}