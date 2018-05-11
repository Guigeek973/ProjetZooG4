package enclos;

import java.util.ArrayList;
import java.util.List;

import animaux.Animal;

public abstract class Enclos <T>{
	
	private String nom;
	private float superficie;
	private int nbAnimauxMax;
	private List<T> lesAnimaux;
	public enum EtatProprete {
		Mauvais,
		Correct,
		Bon
	}
	private EtatProprete proprete;
	
	public Enclos(String nom, float superficie, int nbAnimauxMax, List<T> list) {
		super();
		this.nom = nom;
		this.superficie = superficie;
		this.nbAnimauxMax = nbAnimauxMax;
		this.lesAnimaux = list;
		this.proprete = EtatProprete.Bon;
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
	public List<T> getLesAnimaux() {
		return lesAnimaux;
	}
	public void setLesAnimaux(List<T> lesAnimaux) {
		this.lesAnimaux = lesAnimaux;
	}
	public EtatProprete getProprete() {
		return this.proprete;
	}
	public void setProprete(EtatProprete prop) {
		this.proprete = prop;
	}
	public int getNbAnimauxPresents() {
		return lesAnimaux.size();
	}
	public void addAnimal(T animal) {
		this.lesAnimaux.add(animal);
	}
	public void deleteAnimal(T animal) {
		this.lesAnimaux.remove(this.lesAnimaux.indexOf(animal));
	}
	public void nourrirAllAnimals() {
		for (T animal : this.lesAnimaux) {
			Animal a = (Animal) animal;
			a.manger();
		}
	}
	public void nettoyerEnclos() {
		if (this.getLesAnimaux().size() == 0) {
			if (this.proprete == EtatProprete.Mauvais) {
				this.setProprete(EtatProprete.Correct);
			}
			else if (this.proprete == EtatProprete.Correct) {
				this.proprete = EtatProprete.Bon;
			}
			else System.out.println("Enclos deja en bon etat.");
		}
		else System.out.println("Veuillez vider l'enclos avant.");
	}

	@Override
	public String toString() {
		String textAnimals = null;
		for(T animal : this.getLesAnimaux()) {
			Animal a = (Animal) animal;
			textAnimals = "nom=" + a.getNomEspece() + " age=" + a.getAge() + " poids=" + a.getPoids() + 
					" taille=" + a.getTaille() + " sexe=" + a.getSexe();
		}
		return "Enclos [nom=" + nom + ", superficie=" + superficie + ", nbAnimauxMax=" + nbAnimauxMax + ", proprete=" + proprete + "]";
	}
	
}