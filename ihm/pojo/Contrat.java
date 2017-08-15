package jeuxDeVoitureAuto.pojo;

import java.util.Arrays;
import java.util.Comparator;

import exo6CnedStatTraiteNiceUE.PaysUE;

public class Contrat implements Comparator,Comparable<Contrat>{
	int idContrat;
	Saison saison;
	Ecurie ecurie;
	Pilote[] pilote=new Pilote[2];
	Sponsor sponsor;
	Voiture voiture;
	public int getIdContrat() {
		return idContrat;
	}
	@Override
	public String toString() {
		return "Contrat [idContrat=" + idContrat + ", saison=" + saison + ", ecurie=" + ecurie + ", pilote="
				+ Arrays.toString(pilote) + ", sponsor=" + sponsor + ", voiture=" + voiture + "]";
	}
	public void setIdContrat(int idContrat) {
		this.idContrat = idContrat;
	}
	public Saison getSaison() {
		return saison;
	}
	public void setSaison(Saison saison) {
		this.saison = saison;
	}
	public Ecurie getEcurie() {
		return ecurie;
	}
	public void setEcurie(Ecurie ecurie) {
		this.ecurie = ecurie;
	}
	public Pilote getPilote(){return pilote[0];}
	public void setPilote(Pilote pil){this.pilote[0]=pil;}
	public Pilote getCoPilote(){return pilote[1];}
	public void setCoPilote(Pilote pil){this.pilote[1]=pil;}
	public Pilote[] getListPilote() {
		return pilote;
	}
	public void setListPilote(Pilote[] pilote) {
		this.pilote = pilote;
	}
	public Sponsor getSponsor() {
		return sponsor;
	}
	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer p1 = ((Contrat) obj1).getIdContrat();
	       Integer p2 = ((Contrat) obj2).getIdContrat();

	       if (p1 > p2) {return 1;
	       } else if (p1 < p2){return -1;
	       } else { return 0;}
	}
	@Override
	public int compareTo(Contrat o) {
		return this.idContrat > o.idContrat ? 1 : (this.idContrat < o.idContrat ? -1 : 0);}

}
