package enclos;

import java.util.List;

import animaux.IVolant;

public class Voliere extends Enclos <IVolant> {

	private float hauteur;
	
	public Voliere(String nom, float superficie, int nbAnimauxMax, List<IVolant> lesAnimaux, float hauteur) {
		super(nom, superficie, nbAnimauxMax, lesAnimaux);
		this.hauteur = hauteur;
	}
	
}