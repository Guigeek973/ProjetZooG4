package animaux;

public class Ours extends Animal implements ITerrestre, IMammifere{

	public Ours(String nomEspece, String sexe, Double poids, Double taille, Double age, Boolean indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, sexe, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void manger() {
		System.out.println("L'ours mange la viande.");
		
	}

	@Override
	protected void crier() {
		System.out.println("L'ours hurle au vent !");
		
	}

	@Override
	public void mettreBas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vagabonder() {
		// TODO Auto-generated method stub
		
	}

}
