package model.pojo;

import java.text.Collator;
import java.util.Comparator;

public class Adresse implements Comparator,Comparable<Adresse>{
	int idAdresse; String ville; String pays;

	public int getIdAdresse() {
		return idAdresse;
	}


	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public Adresse(int idAdresse, String ville, String pays) {
		super();
		this.idAdresse = idAdresse;
		this.ville = ville;
		this.pays = pays;
	}


	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", ville=" + ville + ", pays=" + pays + "]";
	}


	@Override
	public int compare(Object obj1, Object obj2) {
		Integer p1 = ((Adresse) obj1).getIdAdresse();
	       Integer p2 = ((Adresse) obj2).getIdAdresse();
	       if (p1 > p2) {return 1;
	       } else if (p1 < p2){return -1;
	       } else { return 0;}
	}
	@Override
	public int compareTo(Adresse o) {
		return this.idAdresse > o.idAdresse ? 1 : (this.idAdresse < o.idAdresse ? -1 : 0);}

}
