package animaux;

public class Loup extends Animal implements ITerrestre, IMammifere{

	public Loup(String nomEspece, Boolean isMale, float poids, float taille, int age, int indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, isMale, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void manger() {
		System.out.println("Le loup dévore la viande.");
		
	}

	@Override
	protected void crier() {
		System.out.println("Le loup hurle très fort !");
		
	}

}
