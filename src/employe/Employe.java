package employe;

import java.util.Iterator;

import animaux.Animal;
import enclos.Enclos;
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
	
	public void examinerEnclos (Enclos<Animal> enclos) {
		System.out.println(enclos.toString());
		for (Animal a : enclos.getLesAnimaux()) {
			System.out.println(a.toString());
		}
		System.out.println("\n");
	}
	public void nettoyerEnclos(Enclos<Animal> enclos) {
		if (enclos.getNbAnimauxPresents() == 0)
			enclos.nettoyerEnclos();
		else {
			Iterator<Animal> itr = enclos.getLesAnimaux().iterator();            
			while(itr.hasNext()){
			    Animal animal = itr.next();
			    itr.remove();
			}
			enclos.nettoyerEnclos();
		}
			
	}
	public void nourrirAnimauxEnclos(Enclos<Animal> enclos) {
		enclos.nourrirAllAnimals();
	}
	public void transférerAnimalToEnclos(Animal animal, Enclos<Animal> enclosA, Enclos<Animal> enclosB) {
		enclosA.deleteAnimal(animal);
		enclosB.addAnimal(animal);
	}
}
