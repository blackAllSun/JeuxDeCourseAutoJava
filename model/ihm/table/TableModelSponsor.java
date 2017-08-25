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
import model.pojo.Sponsor;

public class TableModelSponsor extends AbstractTableModel{
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/jeuxDeVoitureAuto/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=null;
	RootGson root=null;
	List<Sponsor> listSponsor=null;
	String[] title={"ID","Nom","Id Adresse","Budget"};
	public TableModelSponsor(){
		try{
			reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
			root=gson.fromJson(reader, RootGson.class); 
			listSponsor=root.getSponsor();
			Collections.sort(listSponsor);}
		catch(FileNotFoundException ex ){ex.printStackTrace();}
		catch(UnsupportedEncodingException ex){ex.printStackTrace();}}
	@Override
	public int getColumnCount() {return title.length;}

	@Override
	public int getRowCount() {return listSponsor.size();}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0:return listSponsor.get(rowIndex).getIdSponsor();
		case 1:return listSponsor.get(rowIndex).getNom();
		case 2:return root.searchVoiture(rowIndex);
		case 3:return listSponsor.get(rowIndex).getBudget();
		default:throw new IllegalArgumentException();}	
	}
	@Override
	public String getColumnName(int columnIndex) {
		return title[columnIndex];
	}	}
