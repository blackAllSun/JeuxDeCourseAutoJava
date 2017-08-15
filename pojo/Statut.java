package jeuxDeVoitureAuto.pojo;

import com.google.gson.annotations.SerializedName;

public enum Statut {
	@SerializedName("${pilote}")
	PILOTE("pilote"),
	@SerializedName("${copilote}")
	COPILOTE("copilote");
	Statut(String statut){this.statut=statut;}
	String statut;
	public String toString(){return statut;}

}
