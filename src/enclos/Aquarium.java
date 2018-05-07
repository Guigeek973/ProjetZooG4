package enclos;

import java.util.List;
import animaux.INageant;
import animaux.IVolant;

public class Aquarium extends Enclos <INageant> {

	private float profondeur;
	private float saliniteEau;
	
	public Aquarium(String nom, float superficie, int nbAnimauxMax, List<INageant> lesAnimaux, float profondeur, float saliniteEau) {
		super(nom, superficie, nbAnimauxMax, lesAnimaux);
		this.profondeur = profondeur;
		this.saliniteEau = saliniteEau;
	}
	
}