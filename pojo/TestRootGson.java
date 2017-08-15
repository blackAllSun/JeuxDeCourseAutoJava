package jeuxDeVoitureAuto.pojo;

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
import junit.framework.TestCase;

public class TestRootGson extends TestCase{
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
	public TestRootGson() throws FileNotFoundException, UnsupportedEncodingException{testDeserialize();}
	@Test
	public void testSerialize(){
		Gson gson = new GsonBuilder()
			    // .setPrettyPrinting()
			            .create();
}
	@Test
	private void testDeserialize() throws UnsupportedEncodingException, FileNotFoundException {
		System.out.println(root.getName());
		 System.out.println(root);
		/*searchContrat();
		searchPilote();
		searchEcurie();
		searchVoiture();
		searchAdresse();*/
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {new TestRootGson();}
	public void searchContrat() throws UnsupportedEncodingException, FileNotFoundException{
		System.out.println("Contrat : ");

		Collections.sort(listContrat);
		for(Contrat contrat:listContrat){
			 System.out.println("id : "+contrat.getIdContrat());
			 System.out.println(contrat.getEcurie());
			 System.out.println(contrat.getPilote());
			 System.out.println(contrat.getSaison());
			 System.out.println(contrat.getSponsor());
			 System.out.println(contrat.getVoiture());
		 }
	}
	public void searchPilote()throws UnsupportedEncodingException, FileNotFoundException{
		 System.out.println("Pilote : ");

		 Collections.sort(listPilote);
		 for(Pilote pilote:listPilote){
			 System.out.println("IdPilote : "+pilote.getIdPilote());
			 System.out.println("Nom : "+pilote.getNom());
			 System.out.println("Prenom : "+pilote.getPrenom());
			 System.out.println("Age : "+pilote.getAge());
			 System.out.println("Statut : "+pilote.getStatut());
			 System.out.println("Voiture : "+pilote.getIdVoiture());
		 }
	}
	public void searchEcurie() throws UnsupportedEncodingException, FileNotFoundException{
		 System.out.println("Ecurie : ");
		 Collections.sort(listEcurie);
		 for(Ecurie ecurie:listEcurie){
			 System.out.println("id : "+ecurie.getIdEcurie());
			 System.out.println("Nom : "+ecurie.getNom());
			 System.out.println("Adresse : "+ecurie.getAdresse());
			 System.out.println("Budget : "+ecurie.getBudget());
		 }
	}
	public void searchVoiture() throws UnsupportedEncodingException, FileNotFoundException{
		 System.out.println("Voiture : ");

		 Collections.sort(listVoiture);
		 for(Voiture voiture:listVoiture){
			 System.out.println("id : "+voiture.getIdVoiture());
			 System.out.println("Modele : "+voiture.getModele());
			 System.out.println("Puissance : "+voiture.getPuissance());
			 System.out.println("Prix : "+voiture.getPrix());
			 System.out.println("Vitesse Max : "+voiture.getVitesseMax());

		 }
	}
	public void searchAdresse() throws UnsupportedEncodingException, FileNotFoundException{

		 Collections.sort(listAdresse);
		 for(Adresse adresse:listAdresse){
			 System.out.println("id : "+adresse.getIdAdresse());
			 System.out.println("Ville : "+adresse.getVille());
			 System.out.println("Pays : "+adresse.getPays());
		 }
	}
}
