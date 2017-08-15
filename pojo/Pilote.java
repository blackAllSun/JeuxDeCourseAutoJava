package jeuxDeVoitureAuto.pojo;

import java.util.Comparator;

import com.google.gson.annotations.SerializedName;



public class Pilote implements Comparator,Comparable<Pilote>{
	int idPilote;
	String nom;
	String prenom;
	int age;
	//@SerializedName("statut")
	Statut statut;
	Voiture voiture;
	int idVoiture;
	public int getIdVoiture(){return voiture.getIdVoiture();}
	public void setIdVoiture(int idVoiture){voiture.setIdVoiture(idVoiture);}
	public int getIdPilote() {
		return idPilote;
	}

	public void setIdPilote(int idPilote) {
		this.idPilote = idPilote;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public Pilote(int idPilote, String nom, String prenom, int age, Statut statut, Voiture voiture) {
		super();
		this.idPilote = idPilote;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.statut = statut;
		this.voiture = voiture;
	}

	@Override
	public String toString() {
		return "Pilote [idPilote=" + idPilote + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", statut="
				+ statut + ", voiture=" + voiture + "]";
	}
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer p1 = ((Pilote) obj1).getIdPilote();
	       Integer p2 = ((Pilote) obj2).getIdPilote();

	       if (p1 > p2) {return 1;
	       } else if (p1 < p2){return -1;
	       } else { return 0;}
	}
	@Override
	public int compareTo(Pilote o) {
		return this.idPilote > o.idPilote ? 1 : (this.idPilote < o.idPilote ? -1 : 0);}

}
