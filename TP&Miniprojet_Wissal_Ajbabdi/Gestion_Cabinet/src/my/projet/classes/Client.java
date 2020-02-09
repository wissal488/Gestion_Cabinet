package my.projet.classes;

public class Client {

	private int id;
	private String version;
	private String sexe;
	private String nom;
	private String prenom;
	
	public Client(int id,String version, String sexe,String nom, String prenom) {
		this.id=id;
		this.version=version;
		this.sexe=sexe;
		this.nom=nom;
		this.prenom=prenom;
	}

	public Client() {}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
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
	
	
}
