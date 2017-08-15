package jeuxDeVoitureAuto.pojo;

public class Sponsor {
	int idSponsor; String nom; Adresse adresse;float budget;

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

}
