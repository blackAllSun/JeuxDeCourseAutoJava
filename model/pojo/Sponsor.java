package model.pojo;

import java.util.Comparator;

public class Sponsor  implements Comparator,Comparable<Sponsor>{
	int idSponsor; String nom; Adresse adresse;float budget;

	int idAdresse;
	public int getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public Sponsor(int idSponsor, String nom, Adresse adresse, float budget) {
		super();
		this.idSponsor = idSponsor;
		this.nom = nom;
		this.adresse = adresse;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Sponsor [idSponsor=" + idSponsor + ", nom=" + nom + ", adresse=" + adresse + ", budget=" + budget + "]";
	}

	public int getIdSponsor() {
		return idSponsor;
	}

	public void setIdSponsor(int idSponsor) {
		this.idSponsor = idSponsor;
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
	public int compare(Object obj1, Object obj2) {
		Integer p1 = ((Sponsor) obj1).getIdSponsor();
	       Integer p2 = ((Sponsor) obj2).getIdSponsor();

	       if (p1 > p2) {return 1;
	       } else if (p1 < p2){return -1;
	       } else { return 0;}
	}
	@Override
	public int compareTo(Sponsor o) {
		return this.idSponsor > o.idSponsor ? 1 : (this.idSponsor < o.idSponsor ? -1 : 0);}


}
