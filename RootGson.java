package jeuxDeVoitureAuto;

import java.util.ArrayList;
import java.util.List;

import exo6CnedStatTraiteNiceUE.PaysUE;
import jeuxDeVoitureAuto.pojo.Adresse;
import jeuxDeVoitureAuto.pojo.Contrat;
import jeuxDeVoitureAuto.pojo.Ecurie;
import jeuxDeVoitureAuto.pojo.Pilote;
import jeuxDeVoitureAuto.pojo.Sponsor;
import jeuxDeVoitureAuto.pojo.Voiture;

public class RootGson {
	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	List<Pilote> tabPilote=new ArrayList<Pilote>();
	public List<Pilote> getPilote() {return tabPilote;}
	public void setPilote(List<Pilote> tabPilote) {this.tabPilote = tabPilote;}
	List<Ecurie> tabEcurie=new ArrayList<Ecurie>();
	public List<Ecurie> getEcurie() {return tabEcurie;}
	public void setEcurie(List<Ecurie> tabEcurie) {this.tabEcurie = tabEcurie;}
	List<Sponsor> tabSponsor=new ArrayList<Sponsor>();
	public List<Sponsor> getSponsor() {return tabSponsor;}
	public void setSponsor(List<Sponsor> tabSponsor) {this.tabSponsor = tabSponsor;}
	List<Adresse> tabAdresse=new ArrayList<Adresse>();
	public List<Adresse> getAdresse() {return tabAdresse;}
	public void setAdresse(List<Adresse> tabAdresse) {this.tabAdresse = tabAdresse;}
	List<Voiture> tabVoiture=new ArrayList<Voiture>();
	public List<Voiture> getVoiture() {return tabVoiture;}
	public void setVoiture(List<Voiture> tabVoiture) {this.tabVoiture = tabVoiture;}
	List<Contrat> tabContrat=new ArrayList<Contrat>();
	public List<Contrat> getContrat() {return tabContrat;}
	public void setContrat(List<Contrat> tabContrat) {this.tabContrat = tabContrat;}
	
	@Override
	public String toString() {
		return "RootGson [title=" + name + 
				", tabEcurie=" + tabEcurie+ 
				", tabSponsor=" + tabSponsor + 
				", tabAdresse=" + tabAdresse+
				", tabVoiture=" + tabVoiture+
				", tabPilote=" + tabPilote+
				", tabContrat=" +tabContrat+ "]";
	}
	
}
