package model.ihm.list;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.RootGson;
import model.pojo.Contrat;

public class ListModelContrat extends AbstractListModel{
	String jsonString="/home/blackallsun/workspace/JeuxVoitureAuto/src/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=null;
	RootGson root =null; 
	List<Contrat> listContrat=null; 
	public ListModelContrat(){
		try{
			reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
			 root = gson.fromJson(reader, RootGson.class); 
			 listContrat=root.getContrat();
			Collections.sort(listContrat);}
		catch(FileNotFoundException ex ){ex.printStackTrace();}
		catch(UnsupportedEncodingException ex){ex.printStackTrace();}
	}
	@Override
	public Object getElementAt(int rowIndex) {
		return root.searchContrat(rowIndex);
	}

	@Override
	public int getSize() {
		return root.getContrat().size();
	}

}
