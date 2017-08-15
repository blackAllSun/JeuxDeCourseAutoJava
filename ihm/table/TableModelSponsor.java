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
import jeuxDeVoitureAuto.pojo.Sponsor;

public class TableModelSponsor extends AbstractTableModel{
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/jeuxDeVoitureAuto/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
	RootGson root = gson.fromJson(reader, RootGson.class); 
	List<Sponsor> listSponsor=root.getSponsor();
	String[] title={"ID","Nom","Id Adresse","Budget"};
	public TableModelSponsor() throws FileNotFoundException, UnsupportedEncodingException{
		Collections.sort(listSponsor);}
	@Override
	public int getColumnCount() {return title.length;}

	@Override
	public int getRowCount() {return listSponsor.size();}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0:return listSponsor.get(rowIndex).getIdSponsor();
		case 1:return listSponsor.get(rowIndex).getNom();
		case 2:return listSponsor.get(rowIndex).getIdAdresse();
		case 3:return listSponsor.get(rowIndex).getBudget();
		default:throw new IllegalArgumentException();}	
	}
	@Override
	public String getColumnName(int columnIndex) {
		return title[columnIndex];
	}	}
