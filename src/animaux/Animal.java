package animaux;

public abstract class Animal {
	private String nomEspece;
	private Boolean isMale;
	private float poids;
	private float taille;
	private int age ;
	private int indicateurFaim;
	private Boolean indicateurSommeil;
	private Boolean indicateurSante;
	
	public Animal(String nomEspece, Boolean isMale, float poids, float taille, int age, int indicateurFaim,
				  Boolean indicateurSommeil, Boolean indicateurSante) {
		super();
		this.nomEspece = nomEspece;
		this.isMale = isMale;
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
	public Boolean getIsMale() {
		return isMale;
	}
	public float getPoids() {
		return poids;
	}
	public float getTaille() {
		return taille;
	}
	public int getAge() {
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
	public void setSexe(Boolean isMale) {
		this.isMale = isMale;
	}
	public void setPoids(float poids) {
		this.poids = poids;
	}
	public void setTaille(float taille) {
		this.taille = taille;
	}
	public void setAge(int age) {
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
