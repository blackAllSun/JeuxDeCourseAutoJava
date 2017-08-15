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
import jeuxDeVoitureAuto.pojo.Pilote;

public class TableModelPilote extends AbstractTableModel{
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/jeuxDeVoitureAuto/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
	RootGson root = gson.fromJson(reader, RootGson.class); 
	List<Pilote> listPilote=root.getPilote();
	String[] title={"ID","Nom","Prenom","Age","Statut","Voiture"};
	public TableModelPilote() throws FileNotFoundException, UnsupportedEncodingException{
		Collections.sort(listPilote);
	}
	@Override
	public int getColumnCount() {return title.length;}

	@Override
	public int getRowCount() {return listPilote.size();}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex){
		case 0:return listPilote.get(rowIndex).getIdPilote();
		case 1:return listPilote.get(rowIndex).getNom();
		case 2:return listPilote.get(rowIndex).getPrenom();
		case 3:return listPilote.get(rowIndex).getAge();
		case 4:return listPilote.get(rowIndex).getStatut();
		case 5:return listPilote.get(rowIndex).getVoiture();
		default:throw new IllegalArgumentException();}	
	}

}
