package enclos;

public class Enclos {
	private String nom;
	private double superficie;
	private int nbAnimauxMax;
	private int nbAnimauxPresents;
	private List<Animal> lesAnimaux;
	private enum EtatProprete {
		Mauvais,
		Correct,
		Bon
	}
}
