package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


import model.pojo.Adresse;
import model.pojo.Contrat;
import model.pojo.Ecurie;
import model.pojo.Pilote;
import model.pojo.Saison;
import model.pojo.Sponsor;
import model.pojo.Statut;
import model.pojo.Voiture;
import java.awt.Color;
import java.lang.reflect.Field;
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
	public Adresse searchAdresse(int rowIndex){
		int idAdresse=tabAdresse.get(rowIndex).getIdAdresse();
		String ville=tabAdresse.get(idAdresse).getVille();
		String pays=tabAdresse.get(idAdresse).getPays();
		Adresse adresse=new Adresse(idAdresse,ville,pays);
		return adresse;}
	public Sponsor searchSponsor(int rowIndex){
		int idSponsor=tabSponsor.get(rowIndex).getIdSponsor();
		String nom=tabSponsor.get(rowIndex).getNom();
		int idAdresse=tabSponsor.get(rowIndex).getIdAdresse();
		Adresse adresse=this.searchAdresse(idAdresse);
		float budget=tabSponsor.get(rowIndex).getBudget();
		Sponsor sponsor=new Sponsor(idSponsor,nom,adresse,budget);
		return sponsor;
	}
	public Voiture searchVoiture(int rowIndex){
		int idVoiture=tabVoiture.get(rowIndex).getIdVoiture();
		String modele=tabVoiture.get(rowIndex).getModele();
		int puissance=tabVoiture.get(rowIndex).getPuissance();
		int prix=tabVoiture.get(rowIndex).getPrix();
		int vitesseMax=tabVoiture.get(rowIndex).getVitesseMax();
		String color=tabVoiture.get(rowIndex).getCouleur();
		Voiture voiture=new Voiture(idVoiture,modele, puissance,prix,vitesseMax,color);
		return voiture;}
	public Pilote searchPilote(int rowIndex){
		int idPilote=tabPilote.get(rowIndex).getIdPilote();
		String nom=tabPilote.get(rowIndex).getNom();
		String prenom=tabPilote.get(rowIndex).getPrenom();
		int age=tabPilote.get(rowIndex).getAge();
		Statut statut=tabPilote.get(rowIndex).getStatut();
		int idVoiture=tabPilote.get(rowIndex).getIdVoiture();
		Voiture voiture=this.searchVoiture(idVoiture);
		Pilote pilote=new Pilote(idPilote, nom,prenom,age,statut,voiture);
		return pilote;}
	public Contrat searchContrat(int rowIndex){
		int idContrat=tabContrat.get(rowIndex).getIdContrat();
		Saison saison=tabContrat.get(rowIndex).getSaison();
		int idEcurie=tabContrat.get(rowIndex).getIdEcurie();
		Ecurie ecurie=this.searchEcurie(idEcurie);
		Pilote[] pilote=new Pilote[2]; 
		int idPilote=tabContrat.get(rowIndex).getIdPilote();
		int idCoPilote=tabContrat.get(rowIndex).getIdCoPilote();
		pilote[0]=this.searchPilote(idPilote);
		pilote[1]=this.searchPilote(idCoPilote);
		int idSponsor=tabContrat.get(rowIndex).getIdSponsor();
		Sponsor sponsor=this.searchSponsor(idSponsor);
		int idVoiture=tabContrat.get(rowIndex).getIdVoiture();
		Voiture voiture=this.searchVoiture(idVoiture);
		Contrat contrat=new Contrat(idContrat, saison,ecurie, pilote, sponsor,  voiture);
		return contrat;
	}
	public Ecurie searchEcurie(int rowIndex) {
		int idEcurie=tabEcurie.get(rowIndex).getIdEcurie();
		String nom=tabEcurie.get(rowIndex).getNom();
		int idAdresse=tabEcurie.get(rowIndex).getIdAdresse();
		Adresse adresse=this.searchAdresse(idAdresse);
		float budget=tabEcurie.get(rowIndex).getBudget();
		Ecurie ecurie=new Ecurie(idEcurie,nom,adresse,budget);
		return ecurie;
	}
	public Color parseColor(String value){
		if (value == null) {
		      return Color.black;
		    }
		    try {
		      // get color by hex or octal value
		      return Color.decode(value);
		    } catch (NumberFormatException nfe) {
		      // if we can't decode lets try to get it by name
		      try {
		        // try to get a color by name using reflection
		        final Field f = Color.class.getField(value);

		        return (Color) f.get(null);
		      } catch (Exception ce) {
		        // if we can't get any color return black
		        return Color.black;
		      }
		    }
		  }
}
