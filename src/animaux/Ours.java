package animaux;

public class Ours extends Animal implements ITerrestre, IMammifere{

	public Ours(String nomEspece, Boolean isMale, float poids, float taille, int age, int indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, isMale, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		
	}

	@Override
	protected void manger() {
		System.out.println("L'ours mange la viande.");
		
	}

	@Override
	protected void crier() {
		System.out.println("L'ours hurle au vent !");
		
	}

}
