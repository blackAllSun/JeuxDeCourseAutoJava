package model.pojo;

import java.util.Arrays;
import java.util.Comparator;


public class Contrat implements Comparator,Comparable<Contrat>{
	int idContrat;
	Saison saison;
	Ecurie ecurie;
	int idEcurie;
	int idPilote;
	int idCoPilote;
	int idSponsor;
	int idVoiture;
	Pilote[] pilote=new Pilote[2];
	Sponsor sponsor;
	Voiture voiture;
	
	public Contrat(int idContrat, Saison saison, Ecurie ecurie, Pilote[] pilote, Sponsor sponsor, Voiture voiture) {
		super();
		this.idContrat = idContrat;
		this.saison = saison;
		this.ecurie = ecurie;
		this.pilote = pilote;
		this.sponsor = sponsor;
		this.voiture = voiture;
	}
	
	public int getIdCoPilote() {
		return idCoPilote;
	}
	public void setIdCoPilote(int idCoPilote) {
		this.idCoPilote = idCoPilote;
	}

	public int getIdEcurie() {
		return idEcurie;
	}
	public void setIdEcurie(int idEcurie) {
		this.idEcurie = idEcurie;
	}
	public int getIdPilote() {
		return idPilote;
	}
	public void setIdPilote(int idPilote) {
		this.idPilote = idPilote;
	}
	public int getIdSponsor() {
		return idSponsor;
	}
	public void setIdSponsor(int idSponsor) {
		this.idSponsor = idSponsor;
	}
	public int getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}
	public void setPilote(Pilote[] pilote) {
		this.pilote = pilote;
	}


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
