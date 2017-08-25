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
import model.pojo.Contrat;

public class TableModelContrat extends AbstractTableModel{
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/jeuxDeVoitureAuto/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=null;
	RootGson root =null;
	List<Contrat> listContrat=null;
	String[] title={"ID","Saison","Ecurie","Pilote","CoPilote","Sponsor","Voiture"};
	public TableModelContrat() {
		try{
			reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
			root = gson.fromJson(reader, RootGson.class); 
			listContrat=root.getContrat();
			Collections.sort(listContrat);}
		catch(FileNotFoundException ex ){ex.printStackTrace();}
		catch(UnsupportedEncodingException ex){ex.printStackTrace();}}
	@Override
	public int getColumnCount() {return title.length;}

	@Override
	public int getRowCount() {return listContrat.size();}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0:return listContrat.get(rowIndex).getIdContrat();
		case 1:return listContrat.get(rowIndex).getSaison();
		case 2:return root.searchEcurie(rowIndex);
		case 3:return root.searchPilote(rowIndex);
		case 4:return root.searchPilote(rowIndex);
		case 5:return root.searchSponsor(rowIndex);
		case 6:return root.searchVoiture(rowIndex);
		default:throw new IllegalArgumentException();}	
	}
	@Override
	public String getColumnName(int columnIndex) {
		return title[columnIndex];
	}	}
