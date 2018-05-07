package animaux;

public class Pingouin extends Animal implements INageant, IOvipare{

	public Pingouin(String nomEspece, Boolean isMale, float poids, float taille, int age, int indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, isMale, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void manger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void crier() {
		// TODO Auto-generated method stub
		
	}

}
