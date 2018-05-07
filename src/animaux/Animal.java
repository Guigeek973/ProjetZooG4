package animaux;

public abstract class Animal {
	private String nomEspece;
	private String sexe;
	private Double poids;
	private Double taille;
	private Double age ;
	private Boolean indicateurFaim ;
	private Boolean indicateurSommeil;
	private Boolean indicateurSante;
	
	public Animal(String nomEspece, String sexe, Double poids, Double taille, Double age, Boolean indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super();
		this.nomEspece = nomEspece;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
		this.indicateurFaim = indicateurFaim;
		this.indicateurSommeil = indicateurSommeil;
		this.indicateurSante = indicateurSante;
	}
	
	

	public String getNomEspece() {
		return nomEspece;
	}
	public String getSexe() {
		return sexe;
	}
	public Double getPoids() {
		return poids;
	}
	public Double getTaille() {
		return taille;
	}
	public Double getAge() {
		return age;
	}
	public Boolean getIndicateurFaim() {
		return indicateurFaim;
	}
	public Boolean getIndicateurSommeil() {
		return indicateurSommeil;
	}
	public Boolean getIndicateurSante() {
		return indicateurSante;
	}
	public void setNomEspece(String nomEspece) {
		this.nomEspece = nomEspece;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public void setPoids(Double poids) {
		this.poids = poids;
	}
	public void setTaille(Double taille) {
		this.taille = taille;
	}
	public void setAge(Double age) {
		this.age = age;
	}
	public void setIndicateurFaim(Boolean indicateurFaim) {
		this.indicateurFaim = indicateurFaim;
	}
	public void setIndicateurSommeil(Boolean indicateurSommeil) {
		this.indicateurSommeil = indicateurSommeil;
	}
	public void setIndicateurSante(Boolean indicateurSante) {
		this.indicateurSante = indicateurSante;
	}
	
	public abstract void manger();
	public abstract void crier();
	public abstract void etreSoigne();
}