package animaux;

public class Aigle extends Animal implements IVolant, IOvipare {

	public Aigle(String nomEspece, String sexe, Double poids, Double taille, Double age, Boolean indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, sexe, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crier() {
		// TODO Auto-generated method stub
		
	}

}
