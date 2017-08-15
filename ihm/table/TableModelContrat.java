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
import jeuxDeVoitureAuto.pojo.Contrat;

public class TableModelContrat extends AbstractTableModel{
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/jeuxDeVoitureAuto/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
	RootGson root = gson.fromJson(reader, RootGson.class); 
	List<Contrat> listContrat=root.getContrat();
	String[] title={"ID","Saison","Ecurie","Pilote","CoPilote","Sponsor","Voiture"};
	public TableModelContrat() throws FileNotFoundException, UnsupportedEncodingException{
		Collections.sort(listContrat);}
	@Override
	public int getColumnCount() {return title.length;}

	@Override
	public int getRowCount() {return listContrat.size();}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0:return listContrat.get(rowIndex).getIdContrat();
		case 1:return listContrat.get(rowIndex).getSaison();
		case 2:return listContrat.get(rowIndex).getIdEcurie();
		case 3:return listContrat.get(rowIndex).getIdPilote();
		case 4:return listContrat.get(rowIndex).getIdCoPilote();
		case 5:return listContrat.get(rowIndex).getIdSponsor();
		case 6:return listContrat.get(rowIndex).getIdVoiture();
		default:throw new IllegalArgumentException();}	
	}
	@Override
	public String getColumnName(int columnIndex) {
		return title[columnIndex];
	}	}
