package model.ihm.table;

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
import model.pojo.Adresse;

public class TableModelAdress extends AbstractTableModel{
	String jsonString="/home/blackallsun/workspace/JeuxVoitureAuto/src/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=null;
	RootGson root =null; 
	List<Adresse> listAdresse=null; 
	String[] title={"ID","Ville","Pays"};
	public TableModelAdress() {
		try{
			reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
			 root = gson.fromJson(reader, RootGson.class); 
			 listAdresse=root.getAdresse();
			Collections.sort(listAdresse);}
		catch(FileNotFoundException ex ){ex.printStackTrace();}
		catch(UnsupportedEncodingException ex){ex.printStackTrace();}}
	@Override
	public int getColumnCount() {return title.length;}

	@Override
	public int getRowCount() {return listAdresse.size();}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0:return listAdresse.get(rowIndex).getIdAdresse();
		case 1:return listAdresse.get(rowIndex).getVille();
		case 2:return listAdresse.get(rowIndex).getPays();
		default:throw new IllegalArgumentException();}	
	}
	@Override
	public String getColumnName(int columnIndex) {return title[columnIndex];}	
}
