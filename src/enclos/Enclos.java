package enclos;

import java.util.List;

import animaux.Animal;

public abstract class Enclos <T> {
	
	private String nom;
	private float superficie;
	private int nbAnimauxMax;
	private List<T> lesAnimaux;
	private enum EtatProprete {
		Mauvais,
		Correct,
		Bon
	}
	
	public Enclos(String nom, float superficie, int nbAnimauxMax, List<T> lesAnimaux) {
		super();
		this.nom = nom;
		this.superficie = superficie;
		this.nbAnimauxMax = nbAnimauxMax;
		this.lesAnimaux = lesAnimaux;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	
	public int getNbAnimauxMax() {
		return nbAnimauxMax;
	}
	public void setNbAnimauxMax(int nbAnimauxMax) {
		this.nbAnimauxMax = nbAnimauxMax;
	}
	
	public int getNbAnimauxPresents() {
		return lesAnimaux.size();
	}
	
	public List<T> getLesAnimaux() {
		return lesAnimaux;
	}
	public void setLesAnimaux(List<T> lesAnimaux) {
		this.lesAnimaux = lesAnimaux;
	}
}