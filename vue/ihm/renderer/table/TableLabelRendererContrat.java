package vue.ihm.renderer.table;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.RootGson;
import model.pojo.Contrat;

public class TableLabelRendererContrat extends DefaultTableCellRenderer {
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/model/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
	RootGson root = gson.fromJson(reader, RootGson.class); 
	List<Contrat> listContrat=root.getContrat();
	public TableLabelRendererContrat() throws FileNotFoundException, UnsupportedEncodingException{}
	public Component getTableCellRendererComponent(JTable table, Object value,
		                                                 boolean isSelected, boolean hasFocus, 
		                                                 int row, int column) {
		Contrat sponsor=(Contrat) value;
		setText(sponsor.toString());

		    return this;}}