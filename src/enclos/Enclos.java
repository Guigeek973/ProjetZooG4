package enclos;

import java.util.List;
import animaux.Animal;

public class Enclos {
	
	private String nom;
	private double superficie;
	private int nbAnimauxMax;
	private List<Animal> lesAnimaux;
	private enum EtatProprete {
		Mauvais,
		Correct,
		Bon
	}
	
	public Enclos(String nom, double superficie, int nbAnimauxMax, List<Animal> lesAnimaux) {
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
	public void setSuperficie(double superficie) {
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
	
	public List<Animal> getLesAnimaux() {
		return lesAnimaux;
	}
	public void setLesAnimaux(List<Animal> lesAnimaux) {
		this.lesAnimaux = lesAnimaux;
	}
}