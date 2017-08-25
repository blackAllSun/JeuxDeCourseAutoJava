package model.pojo;

import com.google.gson.annotations.SerializedName;

public enum Statut {
	@SerializedName("PILOTE")
	PILOTE("PILOTE"),
	@SerializedName("COPILOTE")
	COPILOTE("COPILOTE");
	Statut(String statut){this.statut=statut;}
	String statut;
	public String toString(){return statut;}

}
