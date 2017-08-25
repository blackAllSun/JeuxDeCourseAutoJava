package model.ihm.tree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.RootGson;
import model.pojo.Pilote;

public class TreeModelPilote   implements TreeModel{
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/jeuxDeVoitureAuto/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=null;
	RootGson root =null;
	List<Pilote> listPilote=null;
	public TreeModelPilote() {
		try{
			reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
			root = gson.fromJson(reader, RootGson.class); 
			listPilote=root.getPilote();
			Collections.sort(listPilote);}
		catch(FileNotFoundException ex ){ex.printStackTrace();}
		catch(UnsupportedEncodingException ex){ex.printStackTrace();}}
	@Override
	public void addTreeModelListener(TreeModelListener arg0) {
	}
	@Override
	public Object getChild(Object parent, int index) {
		if(parent == "Pilote"){return listPilote.get(index);}
        if(parent instanceof Pilote){
        	Pilote g = listPilote.get(listPilote.indexOf(parent));
            return listPilote.get(index);}
        throw new IllegalArgumentException("Parent ne supporte pas objet Tree");}
	@Override
	public int getChildCount(Object parent)
    {
        if(parent == "Pilote")
            return listPilote.size();
        if(parent instanceof Pilote)
        {
        	Pilote g = listPilote.get(listPilote.indexOf(parent));
            return listPilote.size();
        }
        throw new IllegalArgumentException("Parent ne supporte pas objet Tree");
    }
	@Override
	public int getIndexOfChild(Object arg0, Object arg1) {
		return 0;
	}
	@Override
	public Object getRoot() {
		return "Pilote";
	}
	@Override
	public boolean isLeaf(Object node)
    {
        return node instanceof Pilote;
	}
	@Override
	public void removeTreeModelListener(TreeModelListener arg0) {
	}
	@Override
	public void valueForPathChanged(TreePath arg0, Object arg1) {
	}
}
