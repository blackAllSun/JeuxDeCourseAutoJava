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
import model.pojo.Sponsor;

public class TreeModelSponsor implements TreeModel{
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/jeuxDeVoitureAuto/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=null;
	RootGson root =null;
	List<Sponsor> listSponsor=null;
	public TreeModelSponsor() {
		try{
			reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
			root = gson.fromJson(reader, RootGson.class); 
			listSponsor=root.getSponsor();
			Collections.sort(listSponsor);}
		catch(FileNotFoundException ex ){ex.printStackTrace();}
		catch(UnsupportedEncodingException ex){ex.printStackTrace();}}
	@Override
	public void addTreeModelListener(TreeModelListener arg0) {
	}
	@Override
	public Object getChild(Object parent, int index) {
		if(parent == "Sponsor"){return listSponsor.get(index);}
        if(parent instanceof Sponsor){
        	Sponsor g = listSponsor.get(listSponsor.indexOf(parent));
            return listSponsor.get(index);}
        throw new IllegalArgumentException("Parent ne supporte pas objet Tree");}
	@Override
	public int getChildCount(Object parent)
    {
        if(parent == "Sponsor")
            return listSponsor.size();
        if(parent instanceof Sponsor)
        {
        	Sponsor g = listSponsor.get(listSponsor.indexOf(parent));
            return listSponsor.size();
        }
        throw new IllegalArgumentException("Parent ne supporte pas objet Tree");
    }
	@Override
	public int getIndexOfChild(Object arg0, Object arg1) {
		return 0;
	}
	@Override
	public Object getRoot() {
		return "Sponsor";
	}
	@Override
	public boolean isLeaf(Object node)
    {
        return node instanceof Sponsor;
	}
	@Override
	public void removeTreeModelListener(TreeModelListener arg0) {
	}
	@Override
	public void valueForPathChanged(TreePath arg0, Object arg1) {
	}
}
