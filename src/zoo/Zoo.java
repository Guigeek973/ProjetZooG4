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
	
	//modifier al�atoirement l��tat de certains animaux (les rendre malades, les endormir, etc.) ;
	//modifier al�atoirement l��tat de certains enclos (leur propret�, leur salinit�, etc.) ;
	//passer la main � l'employ� (et donc � l�utilisateur) pour qu'il s'occupe du zoo (son nombre d�action par intervalle de temps devant �tre limit�).
}
