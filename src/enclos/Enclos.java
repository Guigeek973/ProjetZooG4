package enclos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import animaux.Animal;

public abstract class Enclos<T extends Animal>{
	
	private String nom;
	private float superficie;
	private int nbAnimauxMax;
	private List<Animal> lesAnimaux;
	public enum EtatProprete {
		Mauvais,
		Correct,
		Bon
	}
	private EtatProprete proprete;
	
	public Enclos(String nom, float superficie, int nbAnimauxMax) {
		super();
		this.nom = nom;
		this.superficie = superficie;
		this.nbAnimauxMax = nbAnimauxMax;
		this.proprete = EtatProprete.Bon;
		this.lesAnimaux = new ArrayList<Animal>();
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
	public List<Animal> getLesAnimaux() {
		return lesAnimaux;
	}
	public void setLesAnimaux(List<Animal> lesAnimaux) {
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
	public void addAnimal(Animal animal) {
		if (this.getNbAnimauxPresents() < this.getNbAnimauxMax()) {
			this.getLesAnimaux().add(animal);
			animal.setEnclos(this);
		}
	}
	public void deleteAnimal(Animal animal) {
		this.lesAnimaux.remove(this.lesAnimaux.indexOf(animal));
		animal.setEnclos(null);
	}
	public void nourrirAllAnimals() {
		System.out.println("On nourrit tous les animaux de l'enclos :");
		for (Animal animal : this.lesAnimaux) {
			animal.manger();
		}
	}
	public void soignerAllAnimals() {
		System.out.println("On soigne tous les animaux de l'enclos :");
		for (Animal animal : this.lesAnimaux) {
			animal.etreSoigne();
		}
	}
	public void nettoyerEnclos() {
		if (this.getLesAnimaux().size() == 0) {
			if (this.proprete == EtatProprete.Mauvais) {
				this.setProprete(EtatProprete.Correct);
				System.out.println("Enclos maintenance correct."  + "\n");
			}
			else if (this.proprete == EtatProprete.Correct) {
				this.proprete = EtatProprete.Bon;
				System.out.println("Enclos maintenant en bon etat."  + "\n");
			}
			else System.out.println("Enclos deja en bon etat."  + "\n");
		}
		else System.out.println("Veuillez vider l'enclos avant."  + "\n");
	}

	@Override
	public String toString() {
		return "[" + nom + ", Etat " + proprete + ", " + superficie + " m², " + nbAnimauxMax + " animaux max ]";
	}
	
}