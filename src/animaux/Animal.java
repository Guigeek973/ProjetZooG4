package animaux;

public abstract class Animal {
	private String nomEspece;
	private String sexe;
	private Double poids;
	private Double taille;
	private Double age ;
	private int indicateurFaim;
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
		this.indicateurFaim = 100;
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
	public int getIndicateurFaim() {
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
	public void setIndicateurFaim(int pointsDeFaim) {
		this.indicateurFaim = pointsDeFaim;
	}
	public void setIndicateurSommeil(Boolean indicateurSommeil) {
		this.indicateurSommeil = indicateurSommeil;
	}
	public void setIndicateurSante(Boolean indicateurSante) {
		this.indicateurSante = indicateurSante;
	}
	
	protected void manger() {
		this.setIndicateurFaim(100);
	}
	protected abstract void crier();
	
	public void etreSoigne() {
		this.setIndicateurSante(true); 
	}
	public void changerEtatSommeil() {
		if (this.getIndicateurSommeil())  { 
			this.setIndicateurSommeil(false); 
		}
		else this.setIndicateurSommeil(true); 
	}
}
