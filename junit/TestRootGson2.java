package jeuxDeVoitureAuto.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import jeuxDeVoitureAuto.RootGson;
import jeuxDeVoitureAuto.pojo.Adresse;
import jeuxDeVoitureAuto.pojo.Contrat;
import jeuxDeVoitureAuto.pojo.Ecurie;
import jeuxDeVoitureAuto.pojo.Pilote;
import jeuxDeVoitureAuto.pojo.Sponsor;
import jeuxDeVoitureAuto.pojo.Statut;
import jeuxDeVoitureAuto.pojo.Voiture;
import junit.framework.TestCase;

public class TestRootGson2 extends TestCase{
	String jsonString="/home/blackallsun/workspace/TPDiversJavaSE/src/jeuxDeVoitureAuto/listeVoiture.json";
	File fileToInternalStorage = new File(jsonString);
	Gson gson = new Gson();
	JsonReader reader=new JsonReader(new InputStreamReader(new FileInputStream(fileToInternalStorage), "UTF-8"));
	RootGson root = gson.fromJson(reader, RootGson.class); 
	List<Contrat> listContrat=root.getContrat();
	List<Pilote> listPilote=root.getPilote();
	List<Ecurie> listEcurie=root.getEcurie();
	List<Voiture> listVoiture=root.getVoiture();
	List<Adresse> listAdresse=root.getAdresse();
	List<Sponsor> listSponsor=root.getSponsor();
	public TestRootGson2() throws FileNotFoundException, UnsupportedEncodingException{
		testDeserialize();}
	@Test
	public void testSerialize(){
		Gson gson = new GsonBuilder()
			    // .setPrettyPrinting()
			            .create();
}
	@Test
	private void testDeserialize() throws UnsupportedEncodingException, FileNotFoundException {
		System.out.println(root.getName());

		for(int iContrat=0;iContrat<listContrat.size();iContrat++)
		 searchContrat(iContrat);
		for(int iPilote=0;iPilote<listPilote.size();iPilote++)
		searchPilote(iPilote);
		for(int iEcurie=0;iEcurie<listEcurie.size();iEcurie++)
		searchEcurie(iEcurie);
		for(int iVoiture=0;iVoiture<listVoiture.size();iVoiture++)
		searchVoiture(iVoiture);
		for(int iAdresse=0;iAdresse<listAdresse.size();iAdresse++)
		searchAdresse(iAdresse);
		for(int iSponsor=0;iSponsor<listSponsor.size();iSponsor++)
			searchSponsor(iSponsor);
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {new TestRootGson2();}
	public void searchContrat(int indexContrat) throws UnsupportedEncodingException, FileNotFoundException{
		System.out.println("Contrat : ");

		Collections.sort(listContrat);

			 System.out.println("id : "+listContrat.get(indexContrat).getIdContrat());
			 //System.out.println(listContrat.get(indexContrat).getEcurie());
			 int idEcurie=listContrat.get(indexContrat).getIdEcurie();
			 searchEcurie(idEcurie);
			// System.out.println(listContrat.get(indexContrat).getPilote());
			 int idPilote=listContrat.get(indexContrat).getIdPilote();
			 searchPilote(idPilote);
			 System.out.println(listContrat.get(indexContrat).getSaison());
			// System.out.println(listContrat.get(indexContrat).getSponsor());
			 int idSponsor=listContrat.get(indexContrat).getIdSponsor();
			 searchSponsor(idSponsor);
			// System.out.println(listContrat.get(indexContrat).getVoiture());
			 int idVoiture=listContrat.get(indexContrat).getIdVoiture();
			 searchVoiture(idVoiture);



	}
	public void searchPilote(int indexPilote)throws UnsupportedEncodingException, FileNotFoundException{
		 System.out.println("**** Pilote :      ****");

		 Collections.sort(listPilote);

			 System.out.println("Id : "+listPilote.get(indexPilote).getIdPilote());
			 System.out.println("Nom : "+listPilote.get(indexPilote).getNom());
			 System.out.println("Prenom : "+listPilote.get(indexPilote).getPrenom());
			 System.out.println("Age : "+listPilote.get(indexPilote).getAge());
			 System.out.println("Statut : "+listPilote.get(indexPilote).getStatut());
			// System.out.println("Voiture : "+listPilote.get(indexPilote).getVoiture());
			 int idVoiture=listPilote.get(indexPilote).getIdVoiture();
			 searchVoiture(idVoiture);
	}
	public void searchEcurie(int indexEcurie) throws UnsupportedEncodingException, FileNotFoundException{
		
		 System.out.println("**** Ecurie :      ****");
		 Collections.sort(listEcurie);

			 System.out.println("id : "+listEcurie.get(indexEcurie).getIdEcurie());
			 System.out.println("Nom : "+listEcurie.get(indexEcurie).getNom());
			// System.out.println("Adresse : "+listEcurie.get(indexEcurie).getAdresse());
			 int idAdresse=listEcurie.get(indexEcurie).getIdAdresse();
			 searchAdresse(idAdresse);
			 System.out.println("Budget : "+listEcurie.get(indexEcurie).getBudget());
		 
	}
	public void searchVoiture(int indexVoiture) throws UnsupportedEncodingException, FileNotFoundException{
		 System.out.println("**** Voiture :      ****");

		 Collections.sort(listVoiture);
	
			 System.out.println("id : "+listVoiture.get(indexVoiture).getIdVoiture());
			 System.out.println("Modele : "+listVoiture.get(indexVoiture).getModele());
			 System.out.println("Puissance : "+listVoiture.get(indexVoiture).getPuissance());
			 System.out.println("Prix : "+listVoiture.get(indexVoiture).getPrix());
			 System.out.println("Vitesse Max : "+listVoiture.get(indexVoiture).getVitesseMax());

		 
	}
	public void searchAdresse(int indexAdresse) throws UnsupportedEncodingException, FileNotFoundException{
		System.out.println("**** Adresse :      ****");
		 Collections.sort(listAdresse);

			 System.out.println("id : "+listAdresse.get(indexAdresse).getIdAdresse());
			 System.out.println("Ville : "+listAdresse.get(indexAdresse).getVille());
			 System.out.println("Pays : "+listAdresse.get(indexAdresse).getPays());
		 
	}
	public void searchSponsor(int indexSponsor) throws UnsupportedEncodingException, FileNotFoundException{
		System.out.println("**** Sponsor :      ****");
		 Collections.sort(listSponsor);

			 System.out.println("id : "+listSponsor.get(indexSponsor).getIdSponsor());
			 System.out.println("Nom : "+listSponsor.get(indexSponsor).getNom());
			 System.out.println("Budget : "+listSponsor.get(indexSponsor).getBudget());
			// System.out.println("Budget : "+listSponsor.get(indexSponsor).getAdresse());
			 int idAdresse=listSponsor.get(indexSponsor).getIdAdresse();
			 searchAdresse(idAdresse);
		 
	}
}