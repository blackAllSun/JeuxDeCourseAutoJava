package jeuxDeVoitureAuto.pojo;

import java.util.Comparator;


public class Voiture implements Comparator,Comparable<Voiture> {
	int idVoiture; String modele; int puissance;int prix;int vitesseMax;

	public Voiture(int idVoiture, String modele, int puissance, int prix, int vitesseMax) {
		super();
		this.idVoiture = idVoiture;
		this.modele = modele;
		this.puissance = puissance;
		this.prix = prix;
		this.vitesseMax = vitesseMax;
	}

	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", modele=" + modele + ", puissance=" + puissance + ", prix=" + prix
				+ ", vitesseMax=" + vitesseMax + "]";
	}

	public int getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer p1 = ((Voiture) obj1).getIdVoiture();
	       Integer p2 = ((Voiture) obj2).getIdVoiture();

	       if (p1 > p2) {return 1;
	       } else if (p1 < p2){return -1;
	       } else { return 0;}
	}
	@Override
	public int compareTo(Voiture o) {
		return this.idVoiture > o.idVoiture ? 1 : (this.idVoiture < o.idVoiture ? -1 : 0);}

}
