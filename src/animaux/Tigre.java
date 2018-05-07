package animaux;

public class Tigre extends Animal implements ITerrestre, IMammifere{

	public Tigre(String nomEspece, Boolean isMale, float poids, float taille, int age, int indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, isMale, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
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
