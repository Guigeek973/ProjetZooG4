package animaux;

import enclos.Enclos;

public abstract class Animal {
	private String nomEspece;
	private float poids;
	private float taille;
	private int age ;
	private int indicateurFaim;
	private Boolean etatFaim;
	private Boolean indicateurSommeil;
	private Boolean indicateurSante;
	private int nbEnfantsMax;
	private Enclos<? extends Animal> enclos;


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
		this.etatFaim = false;
		this.indicateurSommeil = false;
		this.indicateurSante = true;
	}
	
	public Boolean getEtatFaim() {
		return etatFaim;
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
	public void setEtatFaim(Boolean etatFaim) {
		this.etatFaim = etatFaim;
	}
	
	public void manger() {
		this.setIndicateurFaim(100);
		this.setEtatFaim(false);
	}
	public void baisserFaim() {
		if (this.indicateurFaim >= 30) {
			int nb = this.getIndicateurFaim() - 30;
			this.setIndicateurFaim(nb);
			if (this.getIndicateurFaim() <= 50) {
				this.setEtatFaim(true);
			}
		}
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
	public int getNbEnfantsMax() {
		return nbEnfantsMax;
	}
	public void setNbEnfantsMax(int nbEnfantsMax) {
		this.nbEnfantsMax = nbEnfantsMax;
	}
	public Enclos<? extends Animal> getEnclos() {
		return enclos;
	}
	public void setEnclos(Enclos<? extends Animal> enclos) {
		this.enclos = enclos;
	}
	

	@Override
	public String toString() {
		String faim = etatFaim ? "A faim" : "Pas faim";
		String sommeil = indicateurSommeil ? "Endormi" : "Réveillé";
		String sante = indicateurSante ? "Bonne santé" : "Mauvaise santé";

		return "[" + nomEspece + ", " + sexe + ", " + poids + " kg, " + taille + " cm, " + age + " ans, " + faim + ", " + sommeil + ", " + sante + "]";
	}
}
