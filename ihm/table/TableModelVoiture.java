package jeuxDeVoitureAuto.ihm.table;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import jeuxDeVoitureAuto.RootGson;
import jeuxDeVoitureAuto.pojo.Voiture;

public class TableModelVoiture extends AbstractTableModel{
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/jeuxDeVoitureAuto/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
	RootGson root = gson.fromJson(reader, RootGson.class); 
	List<Voiture> listVoiture=root.getVoiture();
	String[] title={"ID","Modele","Puissance","Prix","Vitesse Max"};
	public TableModelVoiture() throws FileNotFoundException, UnsupportedEncodingException{
		Collections.sort(listVoiture);
	}
	@Override
	public int getColumnCount() {return title.length;}

	@Override
	public int getRowCount() {return listVoiture.size();}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0:return listVoiture.get(rowIndex).getIdVoiture();
		case 1:return listVoiture.get(rowIndex).getModele();
		case 2:return listVoiture.get(rowIndex).getPuissance();
		case 3:return listVoiture.get(rowIndex).getPrix();
		case 4:return listVoiture.get(rowIndex).getVitesseMax();
		default:throw new IllegalArgumentException();
		}	
	}
}
