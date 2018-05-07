package animaux;

public class Aigle extends Animal implements IVolant, IOvipare {

	public Aigle(String nomEspece, Boolean isMale, float poids, float taille, int age, int indicateurFaim,
			Boolean indicateurSommeil, Boolean indicateurSante) {
		super(nomEspece, isMale, poids, taille, age, indicateurFaim, indicateurSommeil, indicateurSante);
	}

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crier() {
		// TODO Auto-generated method stub
		
	}
	
	public void pondre() {
		
		
	}

}
