package zoo;

import java.util.List;

import animaux.Animal;

public class Zoo {
	private String nom ;
	private String employ� ;
	private int nbEnclosMax ;
	private int nbEnclos;
	
	public Zoo(String nom, String employ�, int nbEnclosMax, int nbEnclos) {
		super();
		this.nom = nom;
		this.employ� = employ�;
		this.nbEnclosMax = nbEnclosMax;
		this.nbEnclos = nbEnclos;
	}
	
	public void afficherNbAnimauxDansZoo() {
		
	}
	public List<Animal> afficherAnimauxAllEnclos() {
		return null;
	}
	
	
	public void modifierEtatAnimaux() {
		// (les rendre malades, les endormir, etc.) aleatoire
	}
	public void modifierEtatEnclos() {
		// (leur propret�, leur salinit�, etc.) aleatoire
	}
	
	public void donnerLaMain() {
		//passer la main � l'employ� (et donc � l�utilisateur) pour qu'il s'occupe du zoo (son nombre d�action par intervalle de temps devant �tre limit�).
	}
	
}
	
