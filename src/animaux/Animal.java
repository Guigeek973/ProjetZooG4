package animaux;

public abstract class Animal {
	private String nomEspece;
	private float poids;
	private float taille;
	private int age ;
	private int indicateurFaim;
	private Boolean indicateurSommeil;
	private Boolean indicateurSante;
	public enum Sexe {
		Male,
		Femelle
	}
	private Sexe sexe;
	
	public Animal(String nomEspece, Sexe sex, float poids, float taille, int age) {
		super();
		this.nomEspece = nomEspece;
		this.sexe = sex;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
		this.indicateurFaim = 100;
		this.indicateurSommeil = false;
		this.indicateurSante = true;
	}
	
	
	public String getNomEspece() {
		return nomEspece;
	}
	public Sexe getSexe() {
		return sexe;
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
	public void setSexe(Sexe s) {
		this.sexe = s;
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
	
	public void manger() {
		this.setIndicateurFaim(100);
	}
	public abstract void crier();
	
	public void etreSoigne() {
		this.setIndicateurSante(true); 
	}
	public void changerEtatSommeil() {
		if (this.getIndicateurSommeil())  { 
			this.setIndicateurSommeil(false); 
		}
		else this.setIndicateurSommeil(true); 
	}

	

	@Override
	public String toString() {
		return "Animal [nomEspece=" + nomEspece + ", sexe=" + sexe + ", poids=" + poids + ", taille=" + taille
				+ ", age=" + age + ", indicateurFaim=" + indicateurFaim + ", indicateurSommeil=" + indicateurSommeil
				+ ", indicateurSante=" + indicateurSante + ", sexe=" + sexe + "]";
	}
}
