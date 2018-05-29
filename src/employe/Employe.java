package employe;

import java.util.Iterator;

import animaux.Animal;
import enclos.Enclos;
import enclos.EnclosStock;
import enclos.Enclos.EtatProprete;
import zoo.Zoo;

public class Employe {
	private String nom;
	public enum SexeEmp {
		Male,
		Femelle
	}
	private SexeEmp sexe;
	private int age;
	
	public Employe(String nom, SexeEmp sexe, int age) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	public SexeEmp getSexe() {
		return sexe;
	}
	public int getAge() {
		return age;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setSexe(SexeEmp sexe) {
		this.sexe = sexe;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void examinerEnclos (Enclos<? extends Animal> enclos) {
		System.out.println(enclos.toString());
		for (Animal a : enclos.getLesAnimaux()) {
			System.out.println(a.toString());
		}
		System.out.println("\n");
	}
	public void nettoyerEnclos(Enclos<? extends Animal> enclosA, Enclos<? extends Animal> enclosB) {
		if (enclosA.getNbAnimauxPresents() == 0)
			enclosA.nettoyerEnclos();
		else {
			Iterator<Animal> itr = enclosA.getLesAnimaux().iterator();            
			while(itr.hasNext()){
			    Animal animal = itr.next();
			    itr.remove();
			    transférerAnimalToEnclos(animal, enclosA, enclosB);
			}
			enclosA.nettoyerEnclos();
		}
			
	}
	public void nourrirAnimauxEnclos(Enclos<? extends Animal> enclos) {
		enclos.nourrirAllAnimals();
	}
	
	public void soignerAnimauxEnclos(Enclos<? extends Animal> enclos) {
		enclos.soignerAllAnimals();
	}
	
	public void transférerAnimalToEnclos(Animal animal, Enclos<? extends Animal> enclosA, Enclos<? extends Animal> enclosB) {
		if (enclosB.getNbAnimauxPresents() < enclosB.getNbAnimauxMax()) {
			enclosB.addAnimal(animal);
			System.out.println("Animal" + animal.toString() + "transféré vers \n" + enclosB.toString() + "\n");
		}
		else {
			System.out.println("Impossible l'enclos " + enclosB.toString() + " est plein ! " + "\n");
		}
	}
	
}
