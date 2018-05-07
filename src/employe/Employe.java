package employe;

import animaux.Animal;
import enclos.Enclos;

public class Employe {
	private String nom;
	private String sexe;
	private int age;
	
	public Employe(String nom, String sexe, int age) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	public String getSexe() {
		return sexe;
	}
	public int getAge() {
		return age;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void examinerEnclos (Enclos<Animal> enclos) {
		//en affichant les caractéristiques de l’enclos ainsi que la liste des animaux) ;
	}
	public void nettoyerEnclos(Enclos<Animal> enclos) {
		
	}
	public void nourrirAnimauxEnclos(Enclos<Animal> enclos) {
		
	}
	public void transférerAnimalToEnclos(Animal a, Enclos<Animal> enclos) {
		
	}
}
