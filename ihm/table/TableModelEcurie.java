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
import jeuxDeVoitureAuto.pojo.Ecurie;

public class TableModelEcurie extends AbstractTableModel{
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/jeuxDeVoitureAuto/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
	RootGson root = gson.fromJson(reader, RootGson.class); 
	List<Ecurie> listEcurie=root.getEcurie();
	String[] title={"ID","Nom","Id Adresse","Budget"};
	public TableModelEcurie() throws FileNotFoundException, UnsupportedEncodingException{
		Collections.sort(listEcurie);}
	@Override
	public int getColumnCount() {return title.length;}

	@Override
	public int getRowCount() {return listEcurie.size();}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0:return listEcurie.get(rowIndex).getIdEcurie();
		case 1:return listEcurie.get(rowIndex).getNom();
		case 2:return listEcurie.get(rowIndex).getIdAdresse();
		case 3:return listEcurie.get(rowIndex).getBudget();
		default:throw new IllegalArgumentException();}	
	}
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {

		case 0:return Integer.class;
		case 1:
			return String.class;
		case 2:
			return Integer.class;
		case 3:
			return Float.class;

		default:
			return Object.class;
		}
	}
	@Override
	public String getColumnName(int columnIndex) {
		return title[columnIndex];
	}	
	
}