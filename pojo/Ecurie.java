package jeuxDeVoitureAuto.pojo;

import java.util.Comparator;

public class Ecurie implements Comparator,Comparable<Ecurie> {
	int idEcurie; String nom;Adresse adresse; float budget;


	public Ecurie(int idEcurie, String nom, Adresse adresse, float budget) {
		super();
		this.idEcurie = idEcurie;
		this.nom = nom;
		this.adresse = adresse;
		this.budget = budget;
	}


	public int getIdEcurie() {
		return idEcurie;
	}


	public void setIdEcurie(int idEcurie) {
		this.idEcurie = idEcurie;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	public float getBudget() {
		return budget;
	}


	public void setBudget(float budget) {
		this.budget = budget;
	}


	@Override
	public String toString() {
		return "Ecurie [idEcurie=" + idEcurie + ", nom=" + nom + ", adresse=" + adresse + ", budget=" + budget + "]";
	}
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer p1 = ((Ecurie) obj1).getIdEcurie();
	       Integer p2 = ((Ecurie) obj2).getIdEcurie();

	       if (p1 > p2) {return 1;
	       } else if (p1 < p2){return -1;
	       } else { return 0;}
	}
	@Override
	public int compareTo(Ecurie o) {
		return this.idEcurie > o.idEcurie ? 1 : (this.idEcurie < o.idEcurie ? -1 : 0);}


}
