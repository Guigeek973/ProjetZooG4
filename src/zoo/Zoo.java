package zoo;

import java.util.List;

import animaux.Animal;

public class Zoo {
	private String nom ;
	private String employé ;
	private int nbEnclosMax ;
	private int nbEnclos;
	
	public Zoo(String nom, String employé, int nbEnclosMax, int nbEnclos) {
		super();
		this.nom = nom;
		this.employé = employé;
		this.nbEnclosMax = nbEnclosMax;
		this.nbEnclos = nbEnclos;
	}
	
	public void afficherNbAnimauxDansZoo() {
		
	}
	public List<Animal> afficherAnimauxAllEnclos() {
		return null;
	}
	
	//modifier aléatoirement l’état de certains animaux (les rendre malades, les endormir, etc.) ;
	//modifier aléatoirement l’état de certains enclos (leur propreté, leur salinité, etc.) ;
	//passer la main à l'employé (et donc à l’utilisateur) pour qu'il s'occupe du zoo (son nombre d’action par intervalle de temps devant être limité).
}
