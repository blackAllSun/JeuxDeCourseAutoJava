package vue.ihm.renderer.table;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.RootGson;
import model.pojo.Contrat;
import model.pojo.Voiture;
public class TableLabelRendererVoiture extends JPanel implements TableCellRenderer{
	String jsonString="/home/blackallsun/workspace/JeuxVoitureAuto/src/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
	RootGson root = gson.fromJson(reader, RootGson.class); 
	List<Voiture> listVoiture=root.getVoiture();
	String valueStr="";
	public TableLabelRendererVoiture() throws FileNotFoundException, UnsupportedEncodingException{}
	public Component getTableCellRendererComponent(JTable table, Object value,
		                                                 boolean isSelected, boolean hasFocus, 
		                                                 int row, int column) {
		for(Voiture voiture : listVoiture)	{
			voiture=(Voiture) value;
			valueStr+="Id : "+voiture.getIdVoiture()+"\n";
			valueStr+="Modele : "+voiture.getModele()+"\n";
			valueStr+="Puissance : "+voiture.getPuissance()+"\n";
			valueStr+="Prix : "+voiture.getPrix()+"\n";
			valueStr+="Vitesse Max : "+voiture.getVitesseMax()+"\n";
		   // setText(valueStr);
		   System.out.println(valueStr); 
		}

		    return this;
		  }
		}