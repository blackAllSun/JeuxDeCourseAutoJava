package model.ihm.table;

import java.awt.Color;
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

import model.RootGson;
import model.pojo.Voiture;
import java.lang.reflect.Field;
public class TableModelVoiture extends AbstractTableModel{
	String jsonString="/home/blackallsun/workspace/JeuxVoitureAuto/src/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=null;
	RootGson root =null;
	List<Voiture> listVoiture=null;
	String[] title={"ID","Modele","Puissance","Prix","Vitesse Max","Couleur"};
	public TableModelVoiture(){
		try{
			reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
			root = gson.fromJson(reader, RootGson.class); 
			listVoiture=root.getVoiture();
			Collections.sort(listVoiture);}		
		catch(FileNotFoundException ex ){ex.printStackTrace();}
		catch(UnsupportedEncodingException ex){ex.printStackTrace();}}
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
		case 5:{
			String colorStr="Color."+root.searchVoiture(rowIndex).getCouleur();
			Color color=root.parseColor(colorStr);
			return color;}
		default:throw new IllegalArgumentException();
		}	
	}
	@Override
	public String getColumnName(int columnIndex) {
		return title[columnIndex];
	}	
	@Override
	public Class getColumnClass(int columnIndex){
	    switch(columnIndex){
	    	case 0 : return Integer.class;
	    	case 1 : return String.class;
	        case 2: return Integer.class;
	        case 3:	return Integer.class;
	        case 4 : return Integer.class;
	        case 5 : return Color.class;
	        default:
	            return Object.class;
	    }
	}
}
