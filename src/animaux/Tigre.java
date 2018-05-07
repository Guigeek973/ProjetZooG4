package animaux;

public class Tigre extends Animal implements ITerrestre, IMammifere{

	public Tigre(String nomEspece, String sexe, Double poids, Double taille, Double age, Boolean indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, sexe, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void manger() {
		System.out.println("Le tigre déchicte le morceau de viande donné.");
	}

	@Override
	protected void crier() {
		System.out.println("Groaaaaaaarrrghhh !!!");
	}

}
